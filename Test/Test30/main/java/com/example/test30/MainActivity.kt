package com.example.test30

import android.content.Intent
import android.graphics.Matrix
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Click(btn_1)
    }

    fun Click(v : View){
        iv_1.visibility = View.INVISIBLE
        iv_2.visibility = View.INVISIBLE
        iv_3.visibility = View.INVISIBLE

        when(v){
            btn_1 -> iv_1.visibility = View.VISIBLE
            btn_2 -> iv_2.visibility = View.VISIBLE
            btn_3 -> iv_3.visibility = View.VISIBLE
        }
    }
}