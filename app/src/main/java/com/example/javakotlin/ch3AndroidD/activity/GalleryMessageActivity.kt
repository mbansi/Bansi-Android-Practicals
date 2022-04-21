package com.example.javakotlin.ch3AndroidD.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.javakotlin.ch3AndroidD.fragments.AddMessageFragment
import com.example.javakotlin.ch3AndroidD.fragments.GalleryFragment
import com.example.javakotlin.ch3AndroidD.fragments.ViewMessageFragment
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_gallery_message.*

class GalleryMessageActivity: AppCompatActivity() {
    private val galleryFragment = GalleryFragment()
    private val addMessageFragment = AddMessageFragment()
    private val viewMessageFragment = ViewMessageFragment()
    private var activeFragment: Fragment = galleryFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_message)

        supportFragmentManager.beginTransaction().apply {
            add(R.id.fragment, galleryFragment)
            add(R.id.fragment, addMessageFragment).hide(addMessageFragment)
            add(R.id.fragment, viewMessageFragment).hide(viewMessageFragment)
        }.commit()
        setUpBottomNavBar()
    }

    private fun setUpBottomNavBar() {
        bottomNavBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.galleryFragment -> {
                    supportFragmentManager.beginTransaction().hide(activeFragment).show(galleryFragment).commit()
                    activeFragment = galleryFragment
                }
                R.id.addMessageFragment -> {
                    supportFragmentManager.beginTransaction().hide(activeFragment).show(addMessageFragment).commit()
                    activeFragment = addMessageFragment
                }
                R.id.viewMessageFragment -> {
                    supportFragmentManager.beginTransaction().hide(activeFragment).show(viewMessageFragment).commit()
                    activeFragment = viewMessageFragment
                }
            }
            true
        }
    }
}