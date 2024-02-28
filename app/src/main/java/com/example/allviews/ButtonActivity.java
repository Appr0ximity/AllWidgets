package com.example.allviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void onButtonClick(View view) {
        Toast.makeText(getApplicationContext(), "Button Clicked!", Toast.LENGTH_LONG).show();
    }
}