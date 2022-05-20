package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Walkthrough_Tiga_Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLanjut3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough_tiga)

        btnLanjut3 = findViewById(R.id.btn_lanjut3)
        btnLanjut3.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_lanjut3 -> {
                val intentLanjut3 = Intent(this@Walkthrough_Tiga_Activity, HomeActivity::class.java)
                startActivity(intentLanjut3)
            }
        }
    }
}