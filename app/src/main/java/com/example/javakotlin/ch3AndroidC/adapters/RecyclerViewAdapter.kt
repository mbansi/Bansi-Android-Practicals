package com.example.javakotlin.ch3AndroidC.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.javakotlin.ch3AndroidC.viewmodels.CricketerDetails
import com.example.javakotlin.R

class RecyclerViewAdapter(private var cricketerList: ArrayList<CricketerDetails>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private lateinit var context: Context
    private var filterList: ArrayList<CricketerDetails> = cricketerList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.row_recyclerview, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = filterList[position]
        holder.cricketerName?.text = item.title
        holder.cricketerRole?.text = item.subTitle
        holder.cricketerImage?.setImageResource(item.image as Int)
        holder.selectedCricketer?.isChecked = item.selected
    }

    override fun getItemCount(): Int {
        return filterList.size
    }

    fun performSearch(sText: String) {
        val newList = cricketerList.filter {
            it.title?.contains(sText, true) == true
        } as ArrayList<CricketerDetails>

        filterList = newList
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cricketerName: TextView? = null
        var cricketerRole: TextView? = null
        var cricketerImage: ImageView? = null
        var selectedCricketer: CheckBox? = null

        init {
            cricketerName = itemView.findViewById(R.id.tvTitle)
            cricketerRole = itemView.findViewById(R.id.tvSubTitle)
            cricketerImage = itemView.findViewById(R.id.ivItem)
            selectedCricketer = itemView.findViewById(R.id.cbSelectPerson)

            selectedCricketer?.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    Toast.makeText(
                        context,
                        "${cricketerName?.text.toString()} Checked",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                cricketerList[adapterPosition].selected = isChecked
            }
        }
    }
}