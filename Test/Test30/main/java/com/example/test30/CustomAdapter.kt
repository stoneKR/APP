package com.example.test30

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_list.view.*


class Data(val profile: Int, val name: String)

class CustomViewHolder(v : View) : RecyclerView.ViewHolder(v) {
    val profile = v.iv_custom
    val name = v.tv_custom
}

class CustomAdapter(val DataList:ArrayList<Data>, val context: Context) : RecyclerView.Adapter<CustomViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val cellForRow = LayoutInflater.from(context).inflate(R.layout.custom_list, parent, false)
        return CustomViewHolder(cellForRow)
    }
    // 생성하는 부분

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.profile.setImageResource(DataList[position].profile)
        holder.name.text = DataList[position].name

        holder.itemView.setOnClickListener {
            Toast.makeText(context, DataList[position].name, Toast.LENGTH_SHORT).show()
        }
    }
    // 수정하는 부분

    override fun getItemCount() = DataList.size
}