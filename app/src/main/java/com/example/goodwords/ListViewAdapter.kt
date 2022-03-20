package com.example.goodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List: MutableList<String>): BaseAdapter() {
    override fun getCount(): Int {
       return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //convertView: 각 item에 해당하는 view
        var convertView = convertView

        if (convertView == null){
            //layout을 객체화: itemView를 객체화
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val listViewText = convertView!!.findViewById<TextView>(R.id.listViewTextArea)
        listViewText.text = List[position]

        return convertView
    }
}