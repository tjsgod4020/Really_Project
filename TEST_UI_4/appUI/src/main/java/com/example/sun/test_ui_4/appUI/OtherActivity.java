package com.example.sun.test_ui_4.appUI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    public void otherOkButtonClick(View v) {
        Intent intent = new Intent(getApplicationContext(), ListSelectActivity.class);
        startActivity(intent);
    }

    public void othercancelButtonClick(View v) {
        Intent intent = new Intent(getApplicationContext(), ListSelectActivity.class);
        startActivity(intent);
    }
}