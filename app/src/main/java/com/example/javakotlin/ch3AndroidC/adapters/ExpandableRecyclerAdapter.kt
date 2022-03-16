package com.example.javakotlin.ch3AndroidC.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.Group
import androidx.recyclerview.widget.RecyclerView
import com.example.javakotlin.R
import com.example.javakotlin.ch3AndroidC.viewmodels.MovieModel

class ExpandableRecyclerAdapter(
    private val movieList: List<MovieModel>,
) : RecyclerView.Adapter<ExpandableRecyclerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.header_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie: MovieModel = movieList[position]
        holder.name.text = movie.name
        holder.realName.text = movie.realName
        holder.team.text = movie.team
        holder.firstAppearance.text = movie.firstAppearance

        val isExpandable: Boolean = movieList[position].expand
        holder.group.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.card.setOnClickListener {
            val version = movieList[position]
            version.expand = !movie.expand
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.tvMovieName)
        var realName: TextView = itemView.findViewById(R.id.tvRealName)
        var team: TextView = itemView.findViewById(R.id.tvTeam)
        var firstAppearance: TextView = itemView.findViewById(R.id.tvFirstAppearance)
        var card: CardView = itemView.findViewById(R.id.cvMovie)
        var group: Group = itemView.findViewById(R.id.group)
    }
}