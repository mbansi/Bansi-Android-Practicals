package com.example.javakotlin.ch3AndroidE

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_other_views.*

class OtherViewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_views)

        onClickListeners()
    }

    private fun onClickListeners() {
        btnScrollView.setOnClickListener {
            val openScrollViewIntent = Intent(this, ScrollViewActivity::class.java)
            startActivity(openScrollViewIntent)
        }
        btnWebView.setOnClickListener {
            val openWebViewIntent = Intent(this, WebViewActivity::class.java)
            startActivity(openWebViewIntent)
        }
        btnNestedScrollView.setOnClickListener {
            val openNestedScrollViewIntent = Intent(this, NestedScrollViewActivity::class.java)
            startActivity(openNestedScrollViewIntent)
        }
    }
}