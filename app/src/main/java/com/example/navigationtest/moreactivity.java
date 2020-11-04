package com.example.navigationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class moreactivity extends AppCompatActivity {
Toolbar toolbar;
    ImageView img1,img2,img3,img4,img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window g =getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);

        setContentView(R.layout.more_activity);

        /*toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("              DUA'S");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        img1=findViewById(R.id.nameofallah);
        img2=findViewById(R.id.mosque);
        img3=findViewById(R.id.qibla);

        img4=findViewById(R.id.dailydua);
        img5=findViewById(R.id.tasbih);
        img6=findViewById(R.id.alquran);



        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img1=new Intent(moreactivity.this,name_of_allah.class);
                startActivity(img1);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img2=new Intent(moreactivity.this,google_map.class);
                startActivity(img2);
            }
        });

      img3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent img3=new Intent(moreactivity.this,compass.class);
              startActivity(img3);
          }
      });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img4=new Intent(moreactivity.this,page4.class);
                startActivity(img4);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img5=new Intent(moreactivity.this,page5.class);
                startActivity(img5);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img6=new Intent(moreactivity.this,al_quran.class);
                startActivity(img6);
            }
        });




    }
}
