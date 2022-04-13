package com.example.javakotlin.ch5Architecture.mvc.controller

import android.text.TextUtils
import android.util.Patterns
import com.example.javakotlin.R
import com.example.javakotlin.ch5Architecture.mvc.view.LoginMVCActivity
import com.example.javakotlin.ch5Architecture.mvc.model.User

class UserController(private val userModel: User, private val context: LoginMVCActivity) {

    private fun getEmail(): String? {
        return userModel.email
    }

    private fun getPassword(): String? {
        return userModel.password
    }

    fun setEmail(email: String) {
        userModel.email = email
    }

    fun setPassword(password: String) {
        userModel.password = password
    }

    fun isValid(): String? {
        var message: String? = context.getString(R.string.message_success_login)
        if (TextUtils.isEmpty(getEmail()))
            message = context.getString(R.string.message_email_required)
        else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            message = context.getString(R.string.message_proper_email)
        else if (TextUtils.isEmpty(getPassword()))
            message = context.getString(R.string.message_password_required)
        else if (getPassword()?.length != null) {
            val len = getPassword()?.length
            if (len != null) {
                message = if (len <= 8)
                    context.getString(R.string.message_password_too_short)
                else
                    context.getString(R.string.message_success_login)
            }
        }
        return message
    }
}