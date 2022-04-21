package com.example.javakotlin.ch3AndroidE

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import com.example.javakotlin.utils.URL
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        openWebView()
    }

    private fun openWebView() {
        webView.loadUrl(URL)
    }
}