package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class PotoAdapter(private val potoList: ArrayList<Poto>) : RecyclerView.Adapter<PotoAdapter.PotoViewHolder>() {

    class PotoViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_poto, parent, false)
        return PotoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PotoViewHolder, position: Int) {
        val poto = potoList[position]
        holder.imageView.setImageResource(poto.image)

    }

    override fun getItemCount(): Int {
        return potoList.size
    }

}