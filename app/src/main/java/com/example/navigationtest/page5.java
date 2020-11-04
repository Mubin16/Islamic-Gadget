package com.example.navigationtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page5 extends AppCompatActivity {
    public int counter=0;

    TextView tojbhi;
    Button tojbhibtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        tojbhi=findViewById(R.id.tojbhi_text_view);
        tojbhibtn=findViewById(R.id.tojbhi_btn);

        tojbhibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tojbhi.setText(Integer.toString(counter));
            }
        });


    }
}
