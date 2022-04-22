package com.example.javakotlin.ch5Architecture.mvvm.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.javakotlin.R
import com.example.javakotlin.ch5Architecture.mvvm.viewmodel.StudentViewModel
import com.example.javakotlin.ch5Architecture.mvvm.viewmodel.getCustomText
import com.example.javakotlin.databinding.ActivityMvvmBinding
import kotlinx.android.synthetic.main.activity_mvvm.*

class MVVMActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMvvmBinding
    private val viewModel: StudentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        increaseClick()
        Toast.makeText(this, binding.tvNumber.getCustomText(), Toast.LENGTH_SHORT).show()

        viewModel.currentNumber.observe(this, {
            tvNumber.text = it.toString()
        })

        viewModel.currentValue.observe(this, {
            tvEvenOdd.text = it.toString()
        })
    }

    private fun increaseClick() {
        btnIncrease.setOnClickListener {
            viewModel.currentNumber.value = ++viewModel.number
            viewModel.currentValue.value = if (viewModel.number % 2 == 0) "Even" else "Odd"
        }
    }
}