package com.example.cahpter3topic5recyclerview.latihanRacycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cahpter3topic5recyclerview.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listProvinsi = arrayListOf(
            ListProvinsi("Nanggroe Aceh Darussalam","Banda Aceh",R.drawable.rumah_krong_bade_aceh),
            ListProvinsi("Sumatra Utara","Medan",R.drawable.rumah_bolon_sumatera_utara),
            ListProvinsi("umatra Selatan","Palembang",R.drawable.sumatera_selatan_rumah_limas),
            ListProvinsi("Sumatra Barat","Padang",R.drawable.sumatera_barat_rumah_gadang),
            ListProvinsi("Bengkulu","Bengkulu",R.drawable.bengkulu_rumah_bubungan_lima),
            ListProvinsi("Riau","Pekanbaru",R.drawable.riau_rumah_adat_selaso_jatuh),
            ListProvinsi(" Kepulauan Riau","Tanjung Pinang",R.drawable.kepulauan_riau_rumah_atap_limas_potong),
            ListProvinsi("Jambi","Jambi",R.drawable.jambi_rumah_panggung),
            ListProvinsi("Lampung:","Bandar Lampung",R.drawable.lampung_rumah_nuwo_sesat),
            ListProvinsi("Bangka Belitung","Pangkal Pinang",R.drawable.rumah_rakit_bangka_belitung),
            ListProvinsi("Nanggroe Aceh Darussalam","Banda Aceh",R.drawable.rumah_krong_bade_aceh),
            ListProvinsi("Nanggroe Aceh Darussalam","Banda Aceh",R.drawable.rumah_krong_bade_aceh),
            ListProvinsi("Nanggroe Aceh Darussalam","Banda Aceh",R.drawable.rumah_krong_bade_aceh),
            ListProvinsi("Nanggroe Aceh Darussalam","Banda Aceh",R.drawable.rumah_krong_bade_aceh),
            ListProvinsi("Nanggroe Aceh Darussalam","Banda Aceh",R.drawable.rumah_krong_bade_aceh),
        )

        var adapterProvinsi = AdapterProvinsi(listProvinsi)

//        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val gv = GridLayoutManager(this,2)
       rvProvinsii.layoutManager = gv
        rvProvinsii.adapter = adapterProvinsi
    }
}