package com.example.javakotlin.ch3AndroidB.helper

import android.app.Activity
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.javakotlin.R

fun submitFeedback(feedback: Button, activity: Activity) {
    feedback.setOnClickListener {
        Toast.makeText(activity, "Feedback submitted!", Toast.LENGTH_SHORT).show()
    }
}

fun setSpinnerValues(feedbackType: Spinner, activity: Activity) {
    val feedbackArray = mutableListOf("Praise", "Complaint", "Inquiry", "Improvement")
    val feedbackAdapter =
        ArrayAdapter(activity, R.layout.support_simple_spinner_dropdown_item, feedbackArray)
    feedbackType.adapter = feedbackAdapter
}