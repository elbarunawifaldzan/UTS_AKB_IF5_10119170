package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(private val context: Context, private val music: List<Music>, val listener:(Music) -> Unit)
    : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>(){

    class MusicViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgMusic = view.findViewById<ImageView>(R.id.tv_ImgMusic)
        val namaMusic = view.findViewById<TextView>(R.id.tv_item_nama_music)
        val descMusic = view.findViewById<TextView>(R.id.tv_item_cover)

        fun bindView(music: Music, listener: (Music) -> Unit){
            imgMusic.setImageResource(music.imgMusic)
            namaMusic.text = music.namaMusic
            descMusic.text = music.descMusic
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_music, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bindView(music[position], listener)
    }

    override fun getItemCount(): Int = music.size

    }
