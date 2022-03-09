package com.example.javakotlin.ch3AndroidC.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.ch3AndroidC.viewmodels.CricketerDetails
import com.example.javakotlin.R
import com.example.javakotlin.ch3AndroidC.adapters.ListViewHolderAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        setListViewData()
    }

    private fun setListViewData() {
        val cricketers = arrayOf(
            CricketerDetails("Virat Kohli", "Captain", R.drawable.virat),
            CricketerDetails("Mahendra Singh Dhoni", "Wicket Keeper", R.drawable.dhoni),
            CricketerDetails("Jasprit Bumrah", "Bowler", R.drawable.jasprit),
            CricketerDetails("Rohit Sharma", "Bowler", R.drawable.rohit),
            CricketerDetails("Hardik Pandya", "All Rounder", R.drawable.hardik)
        )

        val adapter = ListViewHolderAdapter(this, cricketers)
        lvItems.adapter = adapter
    }
}