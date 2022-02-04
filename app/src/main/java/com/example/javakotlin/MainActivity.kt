package com.example.javakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.javakotlin.ch3AndroidA.FormButtonsActivity
import com.example.javakotlin.ch3AndroidB.activity.LayoutsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openLayouts()
        openFormScreen()
    }

    private fun openLayouts() {
        btnUILayout.setOnClickListener {
            val openLayoutsIntent = Intent(this, LayoutsActivity::class.java)
            startActivity(openLayoutsIntent)
        }
    }

    private fun openFormScreen() {
        btnUIForm.setOnClickListener {
            val openFormIntent = Intent(this, FormButtonsActivity::class.java)
            startActivity(openFormIntent)
        }
    }
}