package com.example.javakotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.bottomnavigation.BottomNavigationActivity
import com.example.javakotlin.layoutmanager.LayoutManagerActivity
import com.example.javakotlin.listview.ListViewActivity
import com.example.javakotlin.recyclerview.RecyclerViewActivity
import com.example.javakotlin.viewpager.ViewPagerActivity
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