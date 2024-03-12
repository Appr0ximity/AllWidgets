package com.example.allviews;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        Button button = findViewById(R.id.homeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ButtonActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void onButtonClick(View view) {
        Toast.makeText(getApplicationContext(), "Button Clicked!", Toast.LENGTH_LONG).show();
    }
}