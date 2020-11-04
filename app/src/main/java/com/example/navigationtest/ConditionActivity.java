package com.example.navigationtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ConditionActivity extends AppCompatActivity {
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition);

        toolbar=findViewById(R.id.ToolbarView);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("      TERMS & CONDITION");
        toolbar.setTitleTextColor(getResources().getColor(R.color.textColor));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}
