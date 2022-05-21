package com.example.atmosphere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Handler handler = new Handler(); //객체생성
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intro.this,ListActivity.class);
                startActivity(intent);
                finish();
            }
        },5000); //5초후에 바뀜
    }
}