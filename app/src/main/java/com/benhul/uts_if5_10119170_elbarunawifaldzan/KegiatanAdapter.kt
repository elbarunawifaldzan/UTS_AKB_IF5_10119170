package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class KegiatanAdapter(private val context: Context, private val kegiatan: List<Kegiatan>, val listener: (Kegiatan) -> Unit)
    : RecyclerView.Adapter<KegiatanAdapter.KegiatanViewHolder>(){

    class KegiatanViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgKegiatan = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaKegiatan = view.findViewById<TextView>(R.id.tv_item_name)

        fun bindView(kegiatan: Kegiatan, listener: (Kegiatan) -> Unit){
            imgKegiatan.setImageResource(kegiatan.imgKegiatan)
            namaKegiatan.text = kegiatan.namaKegiatan

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KegiatanViewHolder {
        return KegiatanViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_kegiatan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KegiatanViewHolder, position: Int) {
        holder.bindView(kegiatan[position], listener)
    }

    override fun getItemCount(): Int = kegiatan.size
    }

