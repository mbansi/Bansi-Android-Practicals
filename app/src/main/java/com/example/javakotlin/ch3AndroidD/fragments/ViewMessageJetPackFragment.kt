package com.example.javakotlin.ch3AndroidD.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.fragment_add_message.*
import kotlinx.android.synthetic.main.fragment_view_message.*
import kotlinx.android.synthetic.main.fragment_view_message_jetpack.*
import kotlinx.android.synthetic.main.fragment_view_message_jetpack.etMessage

class ViewMessageJetPackFragment : Fragment() {

    val args: ViewMessageJetPackFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_message_jetpack, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val msg = args.message
        etMessage.setText(msg)

        fabSaveViewJetpack.setOnClickListener {
            val messageText = etMessage.text.toString()
            val action =
                ViewMessageJetPackFragmentDirections.actionViewMessageJetPackToAddMessageJetpack(
                    messageText
                )
            Navigation.findNavController(view).navigate(action)
        }

    }
}