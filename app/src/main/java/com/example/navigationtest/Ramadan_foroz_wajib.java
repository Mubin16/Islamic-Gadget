package com.example.navigationtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Ramadan_foroz_wajib extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramadan_foroz_wajib);

        toolbar = findViewById(R.id.toolberforoj);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("                Forj/Wajib ");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
