package com.example.allviews;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ContactListView extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list_view);
        ListView listView = findViewById(R.id.listView);
        ArrayList<ContactData> list = new ArrayList<>(getContacts());
        ContactAdapter contactAdapter = new ContactAdapter(this, list);
        listView.setAdapter(contactAdapter);
    }
    @SuppressLint("Range")
    private List<ContactData> getContacts() {
        List<ContactData> contacts = new ArrayList<>();
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);

        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                @SuppressLint("Range") String id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
                @SuppressLint("Range") String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));

                if (Integer.parseInt(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER))) > 0) {
                    Cursor phoneCursor = contentResolver.query(
                            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                            null,
                            ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = ?",
                            new String[]{id},
                            null
                    );

                    if (phoneCursor != null) {
                        String phoneNumber = "";
                        while (phoneCursor.moveToNext()) {
                            phoneNumber = phoneCursor.getString(phoneCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                            contacts.add(new ContactData(name, phoneNumber));
                        }
                        lv= findViewById(R.id.listView);
                        String finalPhoneNumber = phoneNumber;
                        lv.setOnItemClickListener((parent, view, position, id1) -> {
                            Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ finalPhoneNumber));
                            startActivity(i);
                        });
                        phoneCursor.close();
                    }
                }

            }
            cursor.close();
        } else {
            Toast.makeText(this, "No contacts found!", Toast.LENGTH_SHORT).show();
        }
        return contacts;

    }

}