package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Walkthrough_Satu_Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLanjut : Button
    private  lateinit var  btnLewati: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough_satu)

        btnLanjut = findViewById(R.id.btn_lanjut)
        btnLanjut.setOnClickListener(this)

        btnLewati = findViewById(R.id.btn_lewati)
        btnLewati.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_lanjut -> {
                val intentLanjut = Intent(this@Walkthrough_Satu_Activity, Walkthrough_Dua_Activity::class.java)
                startActivity(intentLanjut)
            }
        }

        when(v.id){
            R.id.btn_lewati -> {
                val intentLewati = Intent(this@Walkthrough_Satu_Activity, HomeActivity::class.java)
                startActivity(intentLewati)
            }
        }
    }
}