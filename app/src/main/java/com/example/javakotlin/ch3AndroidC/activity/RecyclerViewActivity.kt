package com.example.javakotlin.ch3AndroidC.activity

import android.os.Bundle
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.ch3AndroidC.viewmodels.CricketerDetails
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_recycler_view.*
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.javakotlin.ch3AndroidC.adapters.RecyclerViewAdapter

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        setRecyclerViewData()
    }

    private fun setRecyclerViewData() {
        val items = arrayListOf(
            CricketerDetails("Virat Kohli", "Captain", R.drawable.virat),
            CricketerDetails("Mahendra Singh Dhoni", "Wicket Keeper", R.drawable.dhoni),
            CricketerDetails("Jasprit Bumrah", "Bowler", R.drawable.jasprit),
            CricketerDetails("Rohit Sharma", "Batsman", R.drawable.rohit),
            CricketerDetails("Hardik Pandya", "All Rounder", R.drawable.hardik),
            CricketerDetails("ViratKohli", "Captain", R.drawable.virat),
            CricketerDetails("MahendraSinghDhoni", "Wicket Keeper", R.drawable.dhoni),
            CricketerDetails("JaspritBumrah", "Bowler", R.drawable.jasprit),
            CricketerDetails("RohitSharma", "Batsman", R.drawable.rohit),
            CricketerDetails("HardikPandya", "All Rounder", R.drawable.hardik),
            CricketerDetails("Virat Kohli RCB", "Captain RCB", R.drawable.virat),
            CricketerDetails("Mahendra Singh Dhoni CSK", "Wicket Keeper CSK", R.drawable.dhoni),
            CricketerDetails("Jasprit Bumrah MI", "Bowler MI", R.drawable.jasprit),
            CricketerDetails("Rohit Sharma MI", "Batsman MI", R.drawable.rohit),
            CricketerDetails("Hardik Pandya MI", "All Rounder MI", R.drawable.hardik),
            CricketerDetails("ViratKohli RCB", "Captain RCB", R.drawable.virat),
            CricketerDetails("MahendraSinghDhoni CSK", "Wicket Keeper CSK", R.drawable.dhoni),
            CricketerDetails("JaspritBumrah MI", "Bowler MI", R.drawable.jasprit),
            CricketerDetails("RohitSharma MI", "Bowler MI", R.drawable.rohit),
            CricketerDetails("HardikPandya MI", "All Rounder MI", R.drawable.hardik)
        )

        val decoration = DividerItemDecoration(applicationContext, RecyclerView.VERTICAL)
        rvCricketers.layoutManager = LinearLayoutManager(this)
        rvCricketers.addItemDecoration(decoration)
        setAdapter(items)
        searchView.setOnQueryTextListener(object : OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                adapter.performSearch(query ?: "")
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.performSearch(newText ?: "")
                return true
            }
        })
    }

    private fun setAdapter(list: ArrayList<CricketerDetails>) {
        adapter = RecyclerViewAdapter(list)
        rvCricketers.adapter = adapter
    }
}


