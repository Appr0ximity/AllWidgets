package com.example.allviews;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    boolean flag = false;
    String[] items = {"Black Coffee", "Cold Coffee", "Hot Coffee", "Hazelnut Coffee"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button button = (Button) findViewById(R.id.homeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SpinnerActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor("#BABABA"));
        ((TextView) parent.getChildAt(0)).setTextSize(20);
        if(!flag){
            flag=true;
            return;
        }
        Toast.makeText(getApplicationContext(), items[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}