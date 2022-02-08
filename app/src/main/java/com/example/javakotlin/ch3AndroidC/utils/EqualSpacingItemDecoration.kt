package com.example.javakotlin.ch3AndroidC.utils

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.graphics.Rect

class EqualSpacingItemDecoration(private var space: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.left = space
        outRect.right = space
    }

}