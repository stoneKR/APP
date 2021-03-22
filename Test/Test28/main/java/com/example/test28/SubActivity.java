package com.example.test28;

import android.os.Bundle;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
    public void Btn1Click(){
        Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT).show();
    }
}
