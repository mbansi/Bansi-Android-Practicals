package com.example.javakotlin.ch5Architecture.mvp.presenter

interface ILoginPresenter {
    fun onLogin(email: String, password: String)
    fun onEmailChange(email: String, password: String)
}