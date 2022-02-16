package com.example.javakotlin.ch3AndroidD.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_jetpack.*

class JetPackActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jetpack)

        navigateFragments()
    }

    private fun navigateFragments() {
        navController = findNavController(R.id.navFragment)
        bottomNavigationBar.setupWithNavController(navController)
    }

}