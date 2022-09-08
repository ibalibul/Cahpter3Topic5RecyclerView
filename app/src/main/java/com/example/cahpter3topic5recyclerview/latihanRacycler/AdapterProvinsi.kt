package com.example.cahpter3topic5recyclerview.latihanRacycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cahpter3topic5recyclerview.R
import org.w3c.dom.Text

class AdapterProvinsi(val listProvinsi : ArrayList<ListProvinsi>) : RecyclerView.Adapter<AdapterProvinsi.ViewHolder>(){

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var namaProvinsi = view.findViewById<TextView>(R.id.Provinsi)
        var namaIbuKota = view.findViewById<TextView>(R.id.tvIbuKota)
        var IgProvinsi = view.findViewById<ImageView>(R.id.ImgProvinsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_provinsi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvinsi.text = listProvinsi[position].namaIbuKota
        holder.namaIbuKota.text = listProvinsi[position].provinsi
        holder.IgProvinsi.setImageResource(listProvinsi[position].Ig)

    }

    override fun getItemCount(): Int {
        return listProvinsi.size
    }
}