package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Walkthrough_Dua_Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLanjut2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough_dua)

        btnLanjut2 = findViewById(R.id.btn_lanjut2)
        btnLanjut2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_lanjut2 -> {
                val intentLanjut2 = Intent(this@Walkthrough_Dua_Activity, Walkthrough_Tiga_Activity::class.java)
                startActivity(intentLanjut2)
            }
        }
    }
}