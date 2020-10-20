package com.example.tayaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChangeLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);

        Button changeLanguageBack = findViewById(R.id.changeLanguageBack);
        changeLanguageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeLanguageBack = new Intent(ChangeLanguage.this,DashBorad.class);
                startActivity(changeLanguageBack);
            }
        });
    }
}