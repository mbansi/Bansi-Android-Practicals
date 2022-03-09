package com.example.javakotlin.ch3AndroidC.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.javakotlin.ch3AndroidC.viewmodels.CricketerDetails
import com.example.javakotlin.R
import com.example.javakotlin.ch3AndroidC.adapters.LayoutManagerAdapter
import com.example.javakotlin.ch3AndroidC.utils.EqualSpacingItemDecoration
import kotlinx.android.synthetic.main.activity_layout_manager.*

class LayoutManagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_manager)

        setData()
    }

    private fun setData() {
        val items = arrayOf(
            CricketerDetails("Virat Kohli",subTitle = null, R.drawable.virat),
            CricketerDetails("MS Dhoni",subTitle = null, R.drawable.dhoni),
            CricketerDetails("Jasprit Bumra",subTitle = null, R.drawable.jasprit),
            CricketerDetails("Rohit Sharma",subTitle = null, R.drawable.rohit),
            CricketerDetails("Hardik Pandya",subTitle = null, R.drawable.hardik),
            CricketerDetails("ViratKohli",subTitle = null, R.drawable.virat),
            CricketerDetails("MSDhoni",subTitle = null, R.drawable.virat),
            CricketerDetails("JaspritBumrah",subTitle = null, R.drawable.virat),
            CricketerDetails("RohitSharma",subTitle = null, R.drawable.virat),
            CricketerDetails("HardikPandya",subTitle = null, R.drawable.virat),
            CricketerDetails("Virat Kohli",subTitle = null, R.drawable.virat),
            CricketerDetails("MS Dhoni",subTitle = null, R.drawable.virat),
            CricketerDetails("Jasprit Bumra",subTitle = null, R.drawable.virat),
            CricketerDetails("Rohit Sharma",subTitle = null, R.drawable.virat),
            CricketerDetails("Hardik Pandya",subTitle = null, R.drawable.virat),
            CricketerDetails("ViratKohli",subTitle = null, R.drawable.virat),
            CricketerDetails("MSDhoni",subTitle = null, R.drawable.virat),
            CricketerDetails("JaspritBumrah",subTitle = null, R.drawable.virat),
            CricketerDetails("RohitSharma",subTitle = null, R.drawable.virat),
            CricketerDetails("HardikPandya",subTitle = null, R.drawable.virat)
        )

        val vertical = DividerItemDecoration(this, RecyclerView.VERTICAL)
        val horizontal = DividerItemDecoration(this, RecyclerView.HORIZONTAL)
        val spacing = EqualSpacingItemDecoration(25)

        rvCricketers.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(applicationContext, 3)
            addItemDecoration(vertical)
            addItemDecoration(horizontal)
            addItemDecoration(spacing)
        }
//        rvCricketers.setHasFixedSize(true)
//        rvCricketers.layoutManager = GridLayoutManager(this, 3)
//        rvCricketers.addItemDecoration(vertical)
//        rvCricketers.addItemDecoration(horizontal)
//        rvCricketers.addItemDecoration(spacing)
        rvCricketers.adapter = LayoutManagerAdapter(items)
    }
}