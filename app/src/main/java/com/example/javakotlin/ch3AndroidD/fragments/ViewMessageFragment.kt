package com.example.javakotlin.ch3AndroidD.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.javakotlin.ch3AndroidD.viewmodel.MessageViewModel
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.fragment_view_message.*

class ViewMessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_message, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val messageModel = ViewModelProvider(requireActivity())[MessageViewModel::class.java]
        messageModel.message.observe(viewLifecycleOwner, {
            tvMessage.text = it
        })

    }
}