package com.example.tayaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        Button orderListBack = findViewById(R.id.orderListBack);
        orderListBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderListBack = new Intent(OrderList.this, DashBorad.class);
                startActivity(orderListBack);
            }
        });

        Button orderDate = findViewById(R.id.orderData);
        orderDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderDate = new Intent (OrderList.this,OrderDate.class);
                startActivity(orderDate);
            }
        });
    }
}