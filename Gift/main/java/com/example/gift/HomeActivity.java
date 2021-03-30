package com.example.gift;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // 안녕하세요

        Button Board = findViewById(R.id.Board);
        Board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d("태그", "값");
            }
        });

        findViewById(R.id.Bible).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });
    }

    public void HomeClick(View v){
        Toast toast = Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10, 10);
        toast.show();
    }


}
