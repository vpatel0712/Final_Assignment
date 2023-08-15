package com.vandan.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.vandan.app.ui.SelectActivity;

public class soonActivity extends AppCompatActivity {


    private int SPLASH_LENGTH=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soon);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {



                Intent i = new Intent(soonActivity.this, SelectActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_LENGTH);

    }
}