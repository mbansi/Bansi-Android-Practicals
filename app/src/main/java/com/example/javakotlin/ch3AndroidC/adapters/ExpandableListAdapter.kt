package com.example.javakotlin.ch3AndroidC.adapters

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.javakotlin.R

class ExpandableListAdapter(
    private val context: Context,
    private val movieHeaderList: List<String>,
    private val movieChildList: HashMap<String, List<String>>
) : BaseExpandableListAdapter() {

    override fun getChild(groupPosition: Int, childPosition: Int): String? {
        return this.movieChildList[this.movieHeaderList[groupPosition]]?.get(childPosition)
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var convertView = convertView
        if (convertView == null) {
            val layoutInflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = layoutInflater.inflate(R.layout.child_movie_details, parent, false)
        }
        val child = convertView?.findViewById<TextView>(R.id.tvRealName)
        child?.text = getChild(groupPosition, childPosition) as String
        return convertView as View
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.movieChildList[this.movieHeaderList[groupPosition]]?.size as Int
    }

    override fun getGroup(groupPosition: Int): String {
        return this.movieHeaderList[groupPosition]
    }

    override fun getGroupCount(): Int {
        return this.movieHeaderList.size
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var convertView = convertView
        val title = getGroup(groupPosition)
        if (convertView == null) {
            val layoutInflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = layoutInflater.inflate(R.layout.header_movie, parent, false)
        }
        val movieHeader = convertView?.findViewById<TextView>(R.id.tvMovieName)
        movieHeader?.setTypeface(null, Typeface.BOLD)
        movieHeader?.text = title
        return convertView as View
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return false
    }

}