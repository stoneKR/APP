package com.example.gift;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Home {

    Button Home = findViewById(R.id.Home);
    Home.setOnClickListener(new View.OnClickListener(){
        @Override
                public Void onClick(View view){
            Log.d("로그", "값")
        }
    })
}
 
