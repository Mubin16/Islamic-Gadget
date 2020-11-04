package com.example.navigationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class compass extends Activity implements SensorEventListener {
    private ImageView image;
    private  float currentDegree = 0f;
    private  SensorManager mSensorManager;
    TextView txtv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compass);
        txtv = findViewById(R.id.txtv);
        image = findViewById(R.id.img);
    }

    @Override
    protected void onResume(){
        super.onResume();
        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mSensorManager.registerListener(this, mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION),
                SensorManager.SENSOR_DELAY_GAME);
    }

   @Override
   protected void onPause(){
        super.onPause();
        mSensorManager.unregisterListener(this);
   }


    @Override
    public void onSensorChanged(SensorEvent event) {
        float degree = Math.round(event.values[0]);

        txtv.setText("Heading: "+ Float.toString(degree) + "degrees");

        RotateAnimation ro = new RotateAnimation(
                currentDegree,
                -degree,
                Animation.RELATIVE_TO_SELF,0.5f,
                Animation.RELATIVE_TO_SELF,0.5f);

        ro.setDuration(210);
        ro.setFillAfter(true);
        image.startAnimation(ro);
        currentDegree = -degree;

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
