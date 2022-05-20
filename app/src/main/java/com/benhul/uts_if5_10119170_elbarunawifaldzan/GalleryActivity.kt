package com.benhul.uts_if5_10119170_elbarunawifaldzan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GalleryActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var potoList: ArrayList<Poto>
    private lateinit var potoAdapter: PotoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        init()

    }
    private fun init(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        potoList = ArrayList()
        addDataToList()

        potoAdapter = PotoAdapter(potoList)
        recyclerView.adapter = potoAdapter
    }

    private fun addDataToList(){

        potoList.add(Poto(R.drawable.gambar1))
        potoList.add(Poto(R.drawable.gambar2))
        potoList.add(Poto(R.drawable.gambar3))
        potoList.add(Poto(R.drawable.gambar4))
        potoList.add(Poto(R.drawable.gambar5))
        potoList.add(Poto(R.drawable.gambar6))
        potoList.add(Poto(R.drawable.gambar7))
        potoList.add(Poto(R.drawable.gambar8))
    }


}