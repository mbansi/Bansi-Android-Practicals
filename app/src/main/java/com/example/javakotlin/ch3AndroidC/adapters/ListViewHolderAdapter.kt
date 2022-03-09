package com.example.javakotlin.ch3AndroidC.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.javakotlin.ch3AndroidC.viewmodels.CricketerDetails
import com.example.javakotlin.R

class ListViewHolderAdapter(
    private var activity: Activity,
    private var cricketerList: Array<CricketerDetails>
) : BaseAdapter() {

    private class ViewHolder(row: View?) {
        var title: TextView? = null
        var subTitle: TextView? = null
        var image: ImageView? = null

        init {
            title = row?.findViewById(R.id.tvTitle)
            subTitle = row?.findViewById(R.id.tvSubTitle)
            image = row?.findViewById(R.id.ivItem)
        }
    }

    override fun getCount(): Int {
        return cricketerList.size
    }

    override fun getItem(position: Int): CricketerDetails {
        return cricketerList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        val viewHolder: ViewHolder
        if (view == null) {
            view = activity.layoutInflater.inflate(R.layout.row_listview, parent, false)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else {
            viewHolder = view.tag as ViewHolder
        }

        val item = cricketerList[position]
        viewHolder.title?.text = item.title
        viewHolder.subTitle?.text = item.subTitle
        viewHolder.image?.setImageResource(item.image as Int)

        return view as View
    }
}