package com.example.navigationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

public class MainActivity_ramadan extends AppCompatActivity {

    CardView cardViewdoa,cardViewfor_wajib,cardViewfajael;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ramjan);

        cardViewdoa = findViewById(R.id.doa);
        cardViewfor_wajib = findViewById(R.id.ramadanforojwajib);
        cardViewfajael = findViewById(R.id.ramadanfajael);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("              RAMADAN");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        cardViewdoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_ramadan.this,Ramadan_doa.class);
                startActivity(intent);
            }
        });
        cardViewfor_wajib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_ramadan.this,Ramadan_foroz_wajib.class);
                startActivity(intent);
            }
        });
        cardViewfajael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_ramadan.this,Ramadan__fajayl.class);
                startActivity(intent);
            }
        });

    }
}
