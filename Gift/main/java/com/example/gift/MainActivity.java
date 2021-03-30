package com.example.gift;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle sevedInstanceState) {
        super.onCreate(sevedInstanceState);
        setContentView(R.layout.activity_main); //안녕하세요

        Intent intent = getIntent();
        String str = intent.getExtras().getString("키");
        Log.d("로그", str);
    }

}
