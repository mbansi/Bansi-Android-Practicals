package com.example.javakotlin.ch3AndroidC.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.javakotlin.ch3AndroidC.viewmodels.CricketerDetails
import com.example.javakotlin.R

class LayoutManagerAdapter(private var cricketerList: Array<CricketerDetails>) :
    RecyclerView.Adapter<LayoutManagerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_layoutmanager, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return cricketerList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = cricketerList[position]
        holder.title?.text = item.title
        holder.image?.setImageResource(item.image as Int)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView? = null
        var image: ImageView? = null

        init {
            title = itemView.findViewById(R.id.tvName)
            image = itemView.findViewById(R.id.ivProfilePicture)
        }
    }
}