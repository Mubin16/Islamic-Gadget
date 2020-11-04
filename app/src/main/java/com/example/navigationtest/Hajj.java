package com.example.navigationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Hajj extends AppCompatActivity {
    public Button btn1,btn2,btn3,btn4,btn5;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazz);

        toolbar = findViewById(R.id.toolbarhaj);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("             Hajj");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hazz = new Intent(Hajj.this, hazz_1_activity.class);
                startActivity(hazz);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent umrah = new Intent(Hajj.this,umrah_activity.class);
                startActivity(umrah);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dua = new Intent(Hajj.this,dua_activity.class);
                startActivity(dua);
            }
        });
    }
}
