package com.example.javakotlin.ch3AndroidA

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_toast.*

class ToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        showNormalToast()
        Toast(this).showCustomToast(this)
    }

    private fun showNormalToast() {
        btnNormal.setOnClickListener {
            Toast.makeText(applicationContext, "Normal Toast Message", Toast.LENGTH_LONG).show()
        }
    }

    private fun Toast.showCustomToast(activity: Activity) {
        btnCustom.setOnClickListener {
            val layout = activity.layoutInflater.inflate(
                R.layout.layout_custom_toast, activity.findViewById(R.id.llToast)
            )
            this.apply {
                setGravity(Gravity.BOTTOM, 20, 60)
                duration = Toast.LENGTH_LONG
                view = layout
                show()
            }
        }
    }
}