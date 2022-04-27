package com.example.javakotlin.ch3AndroidC.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_recycler_adapter.*

class RecyclerAdapterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_adapter)

        onClickListeners()
    }

    private fun onClickListeners() {
        btnListView.setOnClickListener {
            val listViewIntent = Intent(this, ListViewActivity::class.java)
            startActivity(listViewIntent)
        }
        btnRecyclerView.setOnClickListener {
            val recyclerViewIntent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(recyclerViewIntent)
        }
        btnLayoutManager.setOnClickListener {
            val layoutManagerIntent = Intent(this, LayoutManagerActivity::class.java)
            val layoutManagerIntent2 = Intent(this, LayoutManagerActivity::class.java)
            //layoutManagerIntent = layoutManagerIntent2
            startActivity(layoutManagerIntent)
        }
        btnViewPager.setOnClickListener {
            val viewPagerIntent = Intent(this, ViewPagerActivity::class.java)
            startActivity(viewPagerIntent)
        }
        btnBottomNavigation.setOnClickListener {
            val bottomNavigationIntent = Intent(this, BottomNavigationActivity::class.java)
            startActivity(bottomNavigationIntent)
        }
    }
}