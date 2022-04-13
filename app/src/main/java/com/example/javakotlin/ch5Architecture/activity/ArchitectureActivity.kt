package com.example.javakotlin.ch5Architecture.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import com.example.javakotlin.ch5Architecture.mvc.view.LoginMVCActivity
import com.example.javakotlin.ch5Architecture.mvp.view.LoginMVPActivity
import com.example.javakotlin.ch5Architecture.mvvm.view.MVVMActivity
import kotlinx.android.synthetic.main.activity_architecture.*

class ArchitectureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_architecture)

        onClick()
    }

    private fun onClick() {
        btnMVP.setOnClickListener {
            val mvpIntent = Intent(this, LoginMVPActivity::class.java)
            startActivity(mvpIntent)
        }
        btnMVC.setOnClickListener {
            val mvcIntent = Intent(this, LoginMVCActivity::class.java)
            startActivity(mvcIntent)
        }
        btnMVVM.setOnClickListener {
            val mvvmIntent = Intent(this, MVVMActivity::class.java)
            startActivity(mvvmIntent)
        }
    }
}