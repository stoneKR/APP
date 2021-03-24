package com.example.test30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val item = arrayOf("0번","1번","2번","3번","4번","5번","6번","7번","8번","9번","10번","11번","12번")
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)

        listView.onItemClickListener = AdapterView.OnItemClickListener{
            parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position)
            Toast.makeText(this, selectItem.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}