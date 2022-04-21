package com.example.javakotlin.ch3AndroidD.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.javakotlin.ch3AndroidD.viewmodel.MessageViewModel
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.fragment_add_message.*

class AddMessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_message, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val messageModel = ViewModelProvider(requireActivity())[MessageViewModel::class.java]
        fabSave.setOnClickListener {
            val messageText = etMessage.text.toString()
            messageModel.sendMessage(messageText)
            Toast.makeText(context,getString(R.string.text_message_passed),Toast.LENGTH_SHORT).show()
        }
    }

}