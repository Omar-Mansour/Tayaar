package com.example.tayaar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactUs extends AppCompatActivity {

    private AlertDialog.Builder dialogMessage;
    private AlertDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contect_us);

        Button contactUsBack = findViewById(R.id.contactUsBack);
        contactUsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactUsBack = new Intent(ContactUs.this,DashBorad.class);
                startActivity(contactUsBack);
            }
        });
    }
}