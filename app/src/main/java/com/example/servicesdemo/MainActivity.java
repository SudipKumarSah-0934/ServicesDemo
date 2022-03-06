package com.example.servicesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Intent serviceIntent = new Intent(this,
                MYBGService.class);
        startService(serviceIntent);*/
        Intent serviceIntent = new Intent(this,MYFGService.class);
        startForegroundService(serviceIntent);
    }
}