package com.ivan.hvhhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class StartLogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_logo);


        Intent intent = new Intent(this, MainActivity.class);
        new CountDownTimer(1900,1000){
            @Override
            public void onTick(long millisUntilFinished){}

            @Override
            public void onFinish(){
                startActivity(intent);
            }
        }.start();
        finish(); // remove back to startlogo from back button on telephone



    }
}