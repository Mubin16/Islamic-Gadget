package com.example.navigationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RatingActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private Button ratingbarbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        ratingBar=findViewById(R.id.ratingbarid);
        ratingbarbtn=findViewById(R.id.ratingbarbtnid);


        ratingbarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(RatingActivity.this, MainActivity_main.class);
                startActivity(intent);

                String string= String.valueOf(ratingBar.getRating());
                Toast.makeText(RatingActivity.this,"Thanks for your Rating, it's helps us to improve next",Toast.LENGTH_LONG).show();

                /*Toast.makeText(MainActivity.this,string+"Star",Toast.LENGTH_LONG).show();*/
            }
        });

    }
}
