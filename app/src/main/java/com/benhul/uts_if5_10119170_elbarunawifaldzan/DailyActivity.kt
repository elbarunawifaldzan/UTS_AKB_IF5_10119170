package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper

class DailyActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var temanList: ArrayList<Teman>
    private lateinit var temanAdapter: TemanAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily)

        init()


        val kegiatanList = listOf<Kegiatan>(
            Kegiatan(
                R.drawable.icon_music_baru,
                "Sholat Subuh  05:00"
            ),
            Kegiatan(
                R.drawable.icon_music_baru,
                "Belajar / Kuliah  08:00"
            ),
            Kegiatan(
                R.drawable.icon_music_baru,
                "Istirahat dan Sholat Dzuhur  13:00"
            ),
            Kegiatan(
                R.drawable.icon_music_baru,
                "Sholat Ashar  15:10"
            ),
            Kegiatan(
                R.drawable.icon_music_baru,
                "Main  16:00"
            ),
            Kegiatan(
                R.drawable.icon_music_baru,
                "Sholat Magrib  18:00"
            ),
            Kegiatan(
                R.drawable.icon_music_baru,
                "Ngaji dan Sholat Isya  20:00"
            ),
            Kegiatan(
                R.drawable.icon_music_baru,
               "Belajar  21:00"
            ),
            Kegiatan(
                R.drawable.icon_music_baru,
                "Tidur  22:00"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_kegiatan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KegiatanAdapter(this, kegiatanList){

        }
    }
    private fun init(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        temanList = ArrayList()

        addDataToList()

        temanAdapter = TemanAdapter(temanList)
        recyclerView.adapter = temanAdapter
    }

    private fun addDataToList() {
        temanList.add(Teman(R.drawable.teman1, "Riki Wahyudin"))
        temanList.add(Teman(R.drawable.teman2, "Indriyani"))
        temanList.add(Teman(R.drawable.teman3, "Ghani"))
        temanList.add(Teman(R.drawable.teman4, "Failsal"))
        temanList.add(Teman(R.drawable.teman5, "Putriani"))
        temanList.add(Teman(R.drawable.teman6, "Ana"))

    }

}