package com.example.javakotlin.ch3AndroidD.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.fragment_add_message.*
import kotlinx.android.synthetic.main.fragment_add_message.etMessage

class AddMessageJetPackFragment : Fragment() {

    val args: AddMessageJetPackFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_message, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fabSave.setOnClickListener {
            val messageText = etMessage.text.toString()
            Toast.makeText(context,messageText,Toast.LENGTH_SHORT).show()
            val action = AddMessageJetPackFragmentDirections.actionAddMessageFragmentJetpackToViewMessageJetPack(messageText)
            Navigation.findNavController(view).navigate(action)
        }

        val msg = args.message
        etMessage.setText(msg)
    }

}