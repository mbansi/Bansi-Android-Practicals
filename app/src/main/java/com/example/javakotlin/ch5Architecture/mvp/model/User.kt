package com.example.javakotlin.ch5Architecture.mvp.model

import android.text.TextUtils
import android.util.Patterns

class User(override val email: String, override val password: String) : IUser {
    override fun isValid(): Int {
        return if (TextUtils.isEmpty(email)) {
            0
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            1
        } else if (password.length <= 8) {
            2
        } else {
            -1
        }
    }
}