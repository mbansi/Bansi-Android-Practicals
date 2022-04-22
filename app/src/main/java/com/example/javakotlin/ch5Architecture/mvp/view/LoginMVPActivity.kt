package com.example.javakotlin.ch5Architecture.mvp.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import com.example.javakotlin.ch5Architecture.mvp.presenter.ILoginPresenter
import com.example.javakotlin.ch5Architecture.mvp.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_login.*

class LoginMVPActivity : AppCompatActivity(), ILoginView {

    private lateinit var iLoginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initialise()
        onLogin()
    }

    private fun initialise() {
        iLoginPresenter = LoginPresenter(this)
    }

    private fun onLogin() {
        etEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                iLoginPresenter.onEmailChange(etEmail.text.toString(), etPassword.text.toString())
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })

        btnLogin.setOnClickListener {
            iLoginPresenter.onLogin(etEmail.text.toString(), etPassword.text.toString())
        }
    }

    override fun onLoginResult(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    override fun showEmailError(message: String?) {
        emailInputLayout.error = message
    }
}