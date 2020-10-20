package com.example.tayaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button dashBoard = findViewById(R.id.dashBoard);
        dashBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashboard= new Intent(Menu.this,DashBorad.class);
                startActivity(dashboard);
            }
        });

        Button orderList = findViewById(R.id.orderList);
        orderList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderList = new Intent(Menu.this,OrderList.class);
                startActivity(orderList);
            }
        });

        Button personalData = findViewById(R.id.personalData);
        personalData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent personalData = new Intent(Menu.this,PersonalData.class);
                startActivity(personalData);
            }
        });

        Button terms = findViewById(R.id.terms);
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent terms = new Intent(Menu.this,Terms.class);
                startActivity(terms);
            }
        });

        Button changeLanguage = findViewById(R.id.changeLanguage);
        changeLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeLanguage = new Intent(Menu.this,ChangeLanguage.class);
                startActivity(changeLanguage);
            }
        });

        Button changePassword = findViewById(R.id.changePassword);
        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePassword = new Intent(Menu.this,ChangePassword.class);
                startActivity(changePassword);
            }
        });

        Button contactUs = findViewById(R.id.contactUs);
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactUs = new Intent(Menu.this,ContactUs.class);
                startActivity(contactUs);
            }
        });

        Button logOut = findViewById(R.id.logOut);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logOut = new Intent(Menu.this,Login.class);
                startActivity(logOut);
            }
        });
    }
}