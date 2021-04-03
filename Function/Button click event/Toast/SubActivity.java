package com.example.functionjava;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void Btn1Click(View v){
        Toast toast = Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10, 10);
        toast.show();
    }

}


/*
버튼 클릭 이벤트
    public void Btn1Click(View v){
        Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT).show();
    }
Toast를 띄웠음

        public void Btn1Click(View v){
        Toast toast = Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10, 10);
        toast.show();
    }
    Toast를 위치 지정하여 띄웠음


버튼 불러오기
버튼을 불러오려면 아이디를 layout에서 지정해주고 가져와야함
 */