package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MusicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        val musicList = listOf<Music>(
            Music(
                R.drawable.ic_musicsvg,
                "Heat Waves",
                "Glass Animals"
            ),
            Music(
                R.drawable.ic_musicsvg,
                "Dear God",
                "Avenged"
            ),
            Music(
                R.drawable.ic_musicsvg,
                "Night Changes",
                "One Direction"
            ),
            Music(
                R.drawable.ic_musicsvg,
                "KUAT KITA BERSINAR",
                "SUPERMAN IS DEAD"
            ),
            Music(
                R.drawable.ic_musicsvg,
                "The Nights",
                "Avicii"
            ),
            Music(
                R.drawable.ic_musicsvg,
                "Something Just Like This",
                "Coldplay"
            ),
            Music(
                R.drawable.ic_musicsvg,
                "Happy",
                "skinnyfabs"
            ),
            Music(
                R.drawable.ic_musicsvg,
                "Something In The Way",
                "Nirvana"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_music)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MusicAdapter(this, musicList){

        }
    }
}