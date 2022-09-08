package com.example.cahpter3topic5recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(
            ListStudent("andika","232323",R.drawable.mobil_avanza),
            ListStudent("bonge","11111113",R.drawable.mobil_ayla),
            ListStudent("andika","222222223",R.drawable.mobil_apv),
            ListStudent("budi","333333333",R.drawable.mobil_sivic),
            ListStudent("sapri","4444444423",R.drawable.mobil_avanzaa),
        )

        var adapterStudent = StudentAdapter(listStudent)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        rvStudent.layoutManager = lm
        rvStudent.adapter = adapterStudent
    }
}