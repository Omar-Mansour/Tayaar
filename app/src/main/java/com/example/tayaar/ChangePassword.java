package com.example.tayaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChangePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        Button changePasswordBack = findViewById(R.id.changePasswordBack);
        changePasswordBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePasswordBack = new Intent(ChangePassword.this, DashBorad.class);
                startActivity(changePasswordBack);
            }
        });
    }
}