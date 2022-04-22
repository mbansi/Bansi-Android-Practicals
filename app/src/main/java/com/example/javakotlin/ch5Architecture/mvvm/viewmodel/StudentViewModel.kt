package com.example.javakotlin.ch5Architecture.mvvm.viewmodel

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.javakotlin.ch5Architecture.mvvm.model.Student

class StudentViewModel : ViewModel() {
    var number = 0

    val studentViewModel = MutableLiveData<Student>()
    val rollNo = MutableLiveData("101")
    val name = MutableLiveData<String>()

    val currentNumber = MutableLiveData<Int>()
    val currentValue = MutableLiveData<String>()

    fun onClick() {
        val student = Student(rollNo.value, name.value)
        studentViewModel.value = student
    }

}

@BindingAdapter("customText")
fun TextView.setCustomText(item: String) {
    this.text = "My Custom String: $item"
}

@InverseBindingAdapter(attribute = "customText")
fun TextView.getCustomText(): String {
    return this.text.toString()
}
