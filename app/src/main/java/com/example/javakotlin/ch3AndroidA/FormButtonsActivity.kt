package com.example.javakotlin.ch3AndroidA

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import com.example.javakotlin.R
import kotlinx.android.synthetic.main.activity_form_buttons.*

class FormButtonsActivity : AppCompatActivity() {

    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_buttons)

        textChanger()
        submitForm()
        openToastScreen()
    }

    private fun textChanger() {
        etPassword.doOnTextChanged { _, _, _, _ ->
            displayPasswordError()
        }
        etEmail.doOnTextChanged { _, _, _, _ ->
            displayEmailError()
        }
        etName.doOnTextChanged { _, _, _, _ ->
            displayNameError()
        }
    }

    private fun displayNameError() {
        if (getValues(etName).isEmpty()) {
            nameTextInput.error = "Name Required"
        } else {
            nameTextInput.error = null
        }
    }

    private fun displayEmailError() {
        if (!getValues(etEmail).matches(emailPattern.toRegex())) {
            emailTextInput.error = "Invalid email"
            if (etEmail.text.toString().isEmpty()) {
                emailTextInput.error = "Email Required"
            }
        } else {
            emailTextInput.error = null
        }
    }

    private fun displayPasswordError() {
        when (getValues(etPassword).length) {
            0 -> passwordTextInput.error = "Required"
            1, 2, 3, 4, 5, 6, 7 -> passwordTextInput.error = "Password too short"
            else -> passwordTextInput.error = null
        }
    }

    private fun displayErrors() {
        displayNameError()
        displayEmailError()
        displayPasswordError()
        if (!(rbMale.isChecked || rbFemale.isChecked)) {
            Toast.makeText(applicationContext, "Please Select Gender!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun submitForm() {
        Log.d("Toast:valid", "Submitted ${validateForm().toString()}")
        btnSubmit.setOnClickListener {
            if (validateForm()) {
                Toast.makeText(applicationContext, "Form Submitted!", Toast.LENGTH_SHORT).show()
                Log.d("Toast:", "Submitted")
            } else {
                displayErrors()
            }
        }
    }

    private fun validateForm(): Boolean {
        if (getValues(etName).isEmpty() && getValues(etEmail).isEmpty()) {
            return false
        }
        if (!getValues(etEmail).matches(emailPattern.toRegex())) {
            return false
        }
        if (!(rbMale.isChecked || rbFemale.isChecked)) {
            return false
        }
        if (getValues(etPassword).isEmpty() || getValues(etPassword).length < 8) {
            return false
        }
        return true
    }

    private fun openToastScreen() {
        btnToast.setOnClickListener {
            val toastIntent = Intent(this, ToastActivity::class.java)
            startActivity(toastIntent)
        }
    }
}

private fun getValues(name: EditText): String {
    return name.text.toString()
}

