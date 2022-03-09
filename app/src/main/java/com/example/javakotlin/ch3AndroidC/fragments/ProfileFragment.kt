package com.example.javakotlin.ch3AndroidC.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.javakotlin.R
import com.example.javakotlin.ch3AndroidC.adapters.ExpandableListAdapter
import com.example.javakotlin.ch3AndroidC.utils.ListData
import kotlinx.android.synthetic.main.fragment_profile.*
import java.util.ArrayList

class ProfileFragment : Fragment() {

    private var adapter: ExpandableListAdapter? = null
    private var titleList: ArrayList<String>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (elvMovies != null) {
            val listData = ListData.data
            titleList = ArrayList(listData.keys)
            adapter = ExpandableListAdapter(requireContext(), titleList as ArrayList<String>, listData)
            elvMovies.setAdapter(adapter)
        }
    }
}