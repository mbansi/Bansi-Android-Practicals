package com.example.javakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.javakotlin.ch3AndroidC.activity.RecyclerAdapterActivity
import com.example.javakotlin.ch3AndroidE.OtherViewsActivity
import com.example.javakotlin.ch3AndroidD.activity.NavigationActivity
import kotlinx.android.synthetic.main.activity_main.*

import com.example.javakotlin.ch3AndroidA.FormButtonsActivity
import com.example.javakotlin.ch3AndroidB.activity.LayoutsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickListeners()
    }

    private fun onClickListeners() {
        btnUILayout.setOnClickListener {
            val openLayoutsIntent = Intent(this, LayoutsActivity::class.java)
            startActivity(openLayoutsIntent)
        }
        btnUIForm.setOnClickListener {
            val openFormIntent = Intent(this, FormButtonsActivity::class.java)
            startActivity(openFormIntent)
        }
        btnGalleryMessage.setOnClickListener {
            val navigationIntent = Intent(this, NavigationActivity::class.java)
            startActivity(navigationIntent)
        }
        btnRecyclerViewAdapter.setOnClickListener {
            val recyclerIntent = Intent(this, RecyclerAdapterActivity::class.java)
            startActivity(recyclerIntent)
        }
        btnOtherView.setOnClickListener {
            val otherViewIntent = Intent(this,OtherViewsActivity::class.java)
            startActivity(otherViewIntent)
        }
    }


}