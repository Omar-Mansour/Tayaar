package com.example.tayaar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class OrderDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_date);

        Button orderDateBack = findViewById(R.id.orderDateBack);
        orderDateBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderDateBack = new Intent (OrderDate.this,OrderList.class);
                startActivity(orderDateBack);
            }
        });

        Button selectDate = findViewById(R.id.selectDate);
        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectDate = new Intent (OrderDate.this,OrderOfDate.class);
                startActivity(selectDate);
            }
        });
    }
}