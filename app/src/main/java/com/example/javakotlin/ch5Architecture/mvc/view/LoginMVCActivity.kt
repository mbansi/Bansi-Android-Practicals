package com.example.javakotlin.ch5Architecture.mvc.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import com.example.javakotlin.ch5Architecture.mvc.controller.UserController
import com.example.javakotlin.ch5Architecture.mvc.model.User
import kotlinx.android.synthetic.main.activity_login.*

class LoginMVCActivity : AppCompatActivity() {

    private var model: User = User()
    var controller: UserController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        getUserData()
    }

    private fun getUserData() {
        controller = UserController(model, this)
        btnLogin.setOnClickListener {
            controller?.setEmail(etEmail.text.toString())
            controller?.setPassword(etPassword.text.toString())

            Toast.makeText(applicationContext, "${controller?.isValid()}", Toast.LENGTH_SHORT).show()
        }
    }
}