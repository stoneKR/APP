package com.example.gift;


import android.os.Bundle;
import android.util.Log;
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
    }

    public void HomeClick(View v){
        Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT).show();
    }


}
