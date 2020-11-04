package com.example.navigationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_dua extends AppCompatActivity {
    ImageView img,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dua);

        toolbar = findViewById(R.id.toolsalat);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("                   Salat");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);

        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);

        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);
        img9=findViewById(R.id.img9);

        img10=findViewById(R.id.img10);
        img11=findViewById(R.id.img11);
        img12=findViewById(R.id.img12);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img1=new Intent(MainActivity_dua.this,all_dua.class);
                startActivity(img1);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img2=new Intent(MainActivity_dua.this,morning_evening.class);
                startActivity(img2);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img3=new Intent(MainActivity_dua.this,home_family.class);
                startActivity(img3);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img4=new Intent(MainActivity_dua.this,food_drink.class);
                startActivity(img4);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img5=new Intent(MainActivity_dua.this,joy_distress.class);
                startActivity(img5);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img6=new Intent(MainActivity_dua.this,travel.class);
                startActivity(img6);
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img7=new Intent(MainActivity_dua.this,prayer_new.class);
                startActivity(img7);
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img8=new Intent(MainActivity_dua.this,praising_allah.class);
                startActivity(img8);
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img9=new Intent(MainActivity_dua.this,hajj_umrah.class);
                startActivity(img9);
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img10=new Intent(MainActivity_dua.this,good_etiquette.class);
                startActivity(img10);
            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img11=new Intent(MainActivity_dua.this,nature.class);
                startActivity(img11);
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img12=new Intent(MainActivity_dua.this,sickness_death.class);
                startActivity(img12);
            }
        });



    }
}
