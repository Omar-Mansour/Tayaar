package com.example.tayaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        Button personalDataBack = findViewById(R.id.personalDataBack);
        personalDataBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent personalDataBack= new Intent(PersonalData.this,DashBorad.class);
                startActivity(personalDataBack);
            }
        });
    }
}