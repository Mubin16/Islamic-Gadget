package com.example.navigationtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Ramadan_doa extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramadan_doa);

        toolbar = findViewById(R.id.toolbardoa);
    setSupportActionBar(toolbar);
    getSupportActionBar().setTitle("                  Doa ");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}
}
