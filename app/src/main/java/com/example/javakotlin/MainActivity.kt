package com.example.javakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickListeners()
    }

    private fun onClickListeners() {
        btnRecyclerViewAdapter.setOnClickListener {
            val recyclerIntent = Intent(this, RecyclerAdapterActivity::class.java)
            startActivity(recyclerIntent)
        }
    }
}