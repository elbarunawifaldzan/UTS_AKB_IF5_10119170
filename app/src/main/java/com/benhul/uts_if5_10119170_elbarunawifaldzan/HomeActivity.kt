package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnDaily : Button
    private  lateinit var  btnProfile: Button
    private  lateinit var  btnGallery: Button
    private  lateinit var  btnVidio: Button
    private  lateinit var  btnMusic: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnDaily = findViewById(R.id.btn_daily)
        btnDaily.setOnClickListener(this)

        btnProfile = findViewById(R.id.btn_profile)
        btnProfile.setOnClickListener(this)

        btnGallery = findViewById(R.id.btn_galery)
        btnGallery.setOnClickListener(this)

        btnVidio = findViewById(R.id.btn_vidio)
        btnVidio.setOnClickListener(this)

        btnMusic = findViewById(R.id.btn_music)
        btnMusic.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_daily -> {
                val intentDaily = Intent(this@HomeActivity, DailyActivity::class.java)
                startActivity(intentDaily)
            }
        }
        when(v.id){
            R.id.btn_profile -> {
                val intentProfile = Intent(this@HomeActivity, ProfileActivity::class.java)
                startActivity(intentProfile)
            }
        }
        when(v.id){
            R.id.btn_galery -> {
                val intentGallery = Intent(this@HomeActivity, GalleryActivity::class.java)
                startActivity(intentGallery)
            }
        }
        when(v.id){
            R.id.btn_vidio -> {
                val intentVidio = Intent(this@HomeActivity, VideoActivity::class.java)
                startActivity(intentVidio)
            }
        }
        when(v.id){
            R.id.btn_music -> {
                val intentMusic = Intent(this@HomeActivity, MusicActivity::class.java)
                startActivity(intentMusic)
            }
        }
    }

}