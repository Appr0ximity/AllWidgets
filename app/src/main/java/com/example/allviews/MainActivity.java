package com.example.allviews;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToTextViewActivity(View v) {
        Intent i = new Intent(MainActivity.this, TextViewActivity.class);
        startActivity(i);
    }

    public void goToEditTextActivity(View v) {
        Intent i = new Intent(MainActivity.this, EditTextActivity.class);
        startActivity(i);
    }

    public void goToButtonActivity(View v) {
        Intent i = new Intent(MainActivity.this, ButtonActivity.class);
        startActivity(i);
    }

    public void goToImageViewActivity(View v) {
        Intent i = new Intent(MainActivity.this, ImageViewActivity.class);
        startActivity(i);
    }

    public void goToListViewActivity(View v) {
        Intent i = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(i);
    }

    public void goToSpinnerActivity(View v) {
        Intent i = new Intent(MainActivity.this, SpinnerActivity.class);
        startActivity(i);
    }

    public void goToProgressBarActivity(View v) {
        Intent i = new Intent(MainActivity.this, ProgressBarActivity.class);
        startActivity(i);
    }

    public void goToCheckBoxActivity(View v) {
        Intent i = new Intent(MainActivity.this, CheckBoxActivity.class);
        startActivity(i);
    }

    public void goToRadioButtonActivity(View v) {
        Intent i = new Intent(MainActivity.this, RadioButtonActivity.class);
        startActivity(i);
    }

    public void goToSwitchActivity(View v) {
        Intent i = new Intent(MainActivity.this, SwitchActivity.class);
        startActivity(i);
    }

    public void goToSeekBarActivity(View v) {
        Intent i = new Intent(MainActivity.this, SeekBarActivity.class);
        startActivity(i);
    }

    public void goToDatePickerActivity(View v) {
        Intent i = new Intent(MainActivity.this, DatePickerActivity.class);
        startActivity(i);
    }

    public void goToTimePickerActivity(View v) {
        Intent i = new Intent(MainActivity.this, TimePickerActivity.class);
        startActivity(i);
    }

    public void goToAlertDialogActivity(View v) {
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("This is an Alert Dialog").setTitle("Alert Dialog");
        builder.setCancelable(false);
        builder.setPositiveButton("Understood!", (DialogInterface.OnClickListener)(dialog, which)-> dialog.cancel());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void goToToolBarActivity(View v) {
        Intent i = new Intent(MainActivity.this, ToolBarActivity.class);
        startActivity(i);
    }

    public void goToTabLayoutActivity(View v) {
        Intent i = new Intent(MainActivity.this, TabLayoutActivity.class);
        startActivity(i);
    }

}