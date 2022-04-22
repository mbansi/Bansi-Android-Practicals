package com.example.javakotlin.ch5Architecture.mvp.presenter

import com.example.javakotlin.R
import com.example.javakotlin.ch5Architecture.mvp.model.User
import com.example.javakotlin.ch5Architecture.mvp.view.LoginMVPActivity
import com.example.javakotlin.utils.ONE
import com.example.javakotlin.utils.TWO
import com.example.javakotlin.utils.ZERO

class LoginPresenter(private var context: LoginMVPActivity) : ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        when (user.isValid()) {
            ZERO -> context.onLoginResult(context.getString(R.string.error_text_email_required))
            ONE -> context.onLoginResult(context.getString(R.string.error_text_invalid_email))
            TWO -> context.onLoginResult(context.getString(R.string.error_text_short_password))
            else -> context.onLoginResult(context.getString(R.string.message_success_login))
        }
    }

    override fun onEmailChange(email: String, password: String) {
        val user = User(email, password)
        when (user.isValid()) {
            ZERO -> context.showEmailError(context.getString(R.string.error_text_email_required))
            ONE -> context.showEmailError(context.getString(R.string.error_text_invalid_email))
            else -> context.showEmailError(null)
        }
    }
}