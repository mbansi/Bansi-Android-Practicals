package com.example.javakotlin.ch4WebServices.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.javakotlin.R
import com.example.javakotlin.ch4WebServices.Data
import com.example.javakotlin.ch4WebServices.activity.SingleUserActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_delayed_response.view.*

class DelayedResponseAdapter(private val dataList: List<Data>) :
    RecyclerView.Adapter<DelayedResponseAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val itemView =
            LayoutInflater.from(context).inflate(R.layout.row_delayed_response, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fullName.text = "${dataList[position].first_name} ${dataList[position].last_name}"
        holder.email.text = dataList[position].email
        Picasso.get().load(dataList[position].avatar).resize(200, 200).into(holder.avatar)

        holder.item.setOnClickListener {
            val openSingleUserIntent = Intent(context, SingleUserActivity::class.java)
            openSingleUserIntent.putExtra("id", dataList[position].id)
            context.startActivity(openSingleUserIntent)
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var avatar: ImageView
        var fullName: TextView
        var email: TextView
        var item: ConstraintLayout

        init {
            avatar = itemView.ivAvatar
            fullName = itemView.tvFullName
            email = itemView.tvEmail
            item = itemView.item
        }
    }
}