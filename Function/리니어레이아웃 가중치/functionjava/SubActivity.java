package com.example.functionjava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
}
// setContentView(R.layout.activity_sub);
// activity_main에서 activity_sub로 바꿨음
// activity_sub를 호출 하도록 변경함
// activity_sub를 못찾는다고 하면 File에 재실행 누름
