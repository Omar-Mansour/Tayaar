package com.example.tayaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        Button termBack = findViewById(R.id.termBack);
        termBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent termback = new Intent(Terms.this,DashBorad.class);
                startActivity(termback);
            }
        });
    }
}