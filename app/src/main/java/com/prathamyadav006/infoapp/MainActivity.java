package com.prathamyadav006.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText city  = findViewById(R.id.city);
        Button submit =  findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String e = email.getText().toString();
                String c = city.getText().toString();


                Intent intent = new Intent(MainActivity.this , secondActivity.class);
                intent.putExtra("Name", n);
                intent.putExtra("Email", e);
                intent.putExtra("City", c);

                startActivity(intent);
            }
        });
    }
}