package com.prathamyadav006.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView bio_data = (TextView) findViewById(R.id.text2);
        Intent intent = getIntent();
        String n = intent.getStringExtra("Name");
        String e = intent.getStringExtra("Email");
        String c = intent.getStringExtra("City");

        bio_data.setText("I am " +n +"\n\nMy email id is "+e+"\n\nFrom "+c);
    }
}