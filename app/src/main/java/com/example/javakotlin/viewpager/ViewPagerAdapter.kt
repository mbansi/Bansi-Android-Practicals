package com.example.javakotlin.viewpager

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

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
