package com.example.javakotlin.ch3AndroidB.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.javakotlin.R
import com.example.javakotlin.ch3AndroidB.helper.setSpinnerValues
import com.example.javakotlin.ch3AndroidB.helper.submitFeedback
import kotlinx.android.synthetic.main.activity_linear_layout.*

class TableLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)

        supportActionBar?.hide()
        submitFeedback(btnFeedback, this)
        setSpinnerValues(spFeedbackType, this)
    }
}