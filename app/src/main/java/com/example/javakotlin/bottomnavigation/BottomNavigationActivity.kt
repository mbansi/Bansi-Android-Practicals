package com.example.javakotlin.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        supportActionBar?.hide()
        supportFragmentManager.beginTransaction().replace(R.id.flFragment, HomeFragment()).commit()
        setUpBottomNavigation()
    }

    private fun setUpBottomNavigation() {
        bottomNav.setOnItemSelectedListener { item ->
            var fragment = Fragment()
            when (item.itemId) {
                R.id.navHome -> fragment = HomeFragment()
                R.id.navSearch -> fragment = SearchFragment()
                R.id.navProfile -> fragment = ProfileFragment()
            }
            supportFragmentManager.beginTransaction().replace(R.id.flFragment, fragment).commit()
            true
        }
    }
}