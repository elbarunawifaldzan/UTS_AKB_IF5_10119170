package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TemanAdapter(private val temanList : List<Teman>) : RecyclerView.Adapter<TemanAdapter.TemanViewHolder>()  {

    class TemanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val temanImageView : ImageView = itemView.findViewById(R.id.imageView)
        val temanNameTv : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TemanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_teman, parent, false)
        return TemanViewHolder(view)
    }

    override fun onBindViewHolder(holder: TemanViewHolder, position: Int) {
        val teman = temanList[position]
        holder.temanImageView.setImageResource(teman.temanImage)
        holder.temanNameTv.text = teman.temanName
    }

    override fun getItemCount(): Int {
        return temanList.size
    }
}