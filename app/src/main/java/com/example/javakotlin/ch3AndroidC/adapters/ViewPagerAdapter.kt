package com.example.javakotlin.ch3AndroidC.adapters

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.javakotlin.ch3AndroidC.fragments.FavouriteFragment
import com.example.javakotlin.ch3AndroidC.fragments.RecentFragment
import com.example.javakotlin.ch3AndroidC.activity.ViewPagerActivity

class ViewPagerAdapter(viewpager: ViewPagerActivity) : FragmentStateAdapter(viewpager) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("Method:", "createFrag")
        return when (position) {
            0 -> RecentFragment()
            1 -> FavouriteFragment()
            else -> RecentFragment()
        }
    }
}
