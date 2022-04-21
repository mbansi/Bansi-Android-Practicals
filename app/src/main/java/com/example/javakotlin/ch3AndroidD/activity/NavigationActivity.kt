package com.example.javakotlin.ch3AndroidD.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        onClick()
    }

    private fun onClick() {
        btnFragmentManager.setOnClickListener {
            val fragmentManagerIntent = Intent(this, GalleryMessageActivity::class.java)
            startActivity(fragmentManagerIntent)
        }
        btnJetPack.setOnClickListener {
            val jetPackIntent = Intent(this, JetPackActivity::class.java)
            startActivity(jetPackIntent)
        }
    }
}