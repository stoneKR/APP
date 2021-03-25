package com.example.test30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val DataList = arrayListOf(
        Data(R.drawable.test, "0번"),
        Data(R.drawable.test, "1번"),
        Data(R.drawable.test, "2번"),
        Data(R.drawable.test, "3번"),
        Data(R.drawable.test, "4번"),
        Data(R.drawable.test, "5번"),
        Data(R.drawable.test, "6번"),
        Data(R.drawable.test, "7번"),
        Data(R.drawable.test, "8번"),
        Data(R.drawable.test, "9번"),
        Data(R.drawable.test, "10번"),
        Data(R.drawable.test, "11번"),
        Data(R.drawable.test, "12번")

    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(DataList)


    }
}