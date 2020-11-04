package com.example.navigationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_zakat extends AppCompatActivity {
    public ImageButton essentialBtn,conditionalBtn;
    public EditText inputData,cash,gold,asset;
    public TextView outputBtn,total,resultBtn;

    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window g = getWindow();
                g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);

        setContentView(R.layout.activity_main_zakat);


        cash = findViewById(R.id.cashEditText);
        gold= findViewById(R.id.goldEditText);
        asset= findViewById(R.id.assetEditText);


        total = findViewById(R.id.totalTextView);



        essentialBtn = findViewById(R.id.essentialImgBtn);
        conditionalBtn= findViewById(R.id.conditionImgBtn);
        inputData = findViewById(R.id.Zakat_Input);
        resultBtn= findViewById(R.id.zakat_AmountButton);
        outputBtn=findViewById(R.id.zakat_Result);



        /*toolbar = findViewById(R.id.ZakatToolbarView);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("                ZAKAT");
        toolbar.setTitleTextColor(getResources().getColor(R.color.textColor));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/




        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(cash.getText().toString());
                Double number2 = Double.parseDouble(gold.getText().toString());
                Double number3 = Double.parseDouble(asset.getText().toString());
                Double sum = number1+number2+number3;
                inputData.setText(Double.toString(sum));

            }
        });



        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float total_zakat=Float.parseFloat(inputData.getText().toString());
                float calculate_zakat= total_zakat/40;

                outputBtn.setText(Float.toString(calculate_zakat));


            }
        });


        conditionalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_zakat.this,ConditionActivity.class);
                startActivity(intent);
            }
        });


        essentialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_zakat.this,EssentialActivity.class);
                startActivity(intent);

            }
        });
    }
}
