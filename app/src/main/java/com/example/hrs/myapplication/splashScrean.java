package com.example.hrs.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashScrean extends AppCompatActivity {
    private static int Splash_Timer=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screan);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashScrean.this,MainActivity.class);
                startActivities(new Intent[]{intent});
            }
        },Splash_Timer);
    }
}
