package com.example.cahpter3topic5recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val listStudent : ArrayList<ListStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>(){

//    ambil id dari layout
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.txtNameStudent)
        var nimStudent = view.findViewById<TextView>(R.id.txtNimStudent)
        var imgStudent = view.findViewById<ImageView>(R.id.ImgStudent)

    }

//    buat objek viewHolder - untuk register view - inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent,false)
    return ViewHolder(view)
    }

//    buat set data ke layoutnya
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.imgStudent.setImageResource(listStudent[position].img)
    }

//    ada berapa yang akan muncul di RecylerView
    override fun getItemCount(): Int {
      return listStudent.size
    }

}