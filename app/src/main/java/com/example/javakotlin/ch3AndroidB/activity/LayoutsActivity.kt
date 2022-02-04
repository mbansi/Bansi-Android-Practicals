package com.example.javakotlin.ch3AndroidB.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_layouts.*

class LayoutsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts)

        onClickListeners()
    }

    private fun onClickListeners() {
        btnLinear.setOnClickListener {
            val linearIntent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(linearIntent)
        }

        btnRelative.setOnClickListener {
            val relativeIntent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(relativeIntent)
        }

        btnConstraint.setOnClickListener {
            val constraintIntent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(constraintIntent)
        }

        btnTable.setOnClickListener {
            val tableIntent = Intent(this, TableLayoutActivity::class.java)
            startActivity(tableIntent)
        }

        btnFrame.setOnClickListener {
            val frameIntent = Intent(this, FrameLayoutActivity::class.java)
            startActivity(frameIntent)
        }
    }
}