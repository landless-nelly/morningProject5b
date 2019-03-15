package com.nelly.morningproject5b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerActivity extends AppCompatActivity {
    Button btnCustomer,btnSupplier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        btnCustomer=findViewById(R.id.btnCustomer);
        btnSupplier=findViewById(R.id.btnSupplier);
        btnSupplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kuja=new Intent(MainActivity.this,SupplierActivity.class);
            }
        });
        btnCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sema=new Intent(MainActivity.this,CustomerActivity.class);
            }
        });
    }
}
