package com.example.test30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    var DataList = arrayListOf(
        Data(R.drawable.test, "0번"),
        Data(R.drawable.test, "1번"),
        Data(R.drawable.test, "2번"),
        Data(R.drawable.test, "3번")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView.adapter = CustomAdapter(this, DataList)



        listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as Data
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }


    }
}