package com.example.javakotlin.ch5Architecture.mvp.view

interface ILoginView {
    fun onLoginResult(message: String)
    fun showEmailError(message: String?)
}