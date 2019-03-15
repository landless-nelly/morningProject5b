package com.nelly.morningproject5b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button mcustomer,msupplier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcustomer=findViewById(R.id.btnCustomer);
        msupplier=findViewById(R.id.btnSupplier);
        mcustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cust =new Intent(MainActivity.this,CustomerActivity.class);
                startActivity(cust);
            }
        });msupplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sup =new Intent(MainActivity.this,SupplierActivity.class);
                startActivity(sup);
            }
        });
    }
}
