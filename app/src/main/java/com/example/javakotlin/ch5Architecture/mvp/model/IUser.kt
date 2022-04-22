package com.example.javakotlin.ch5Architecture.mvp.model

interface IUser {
    val email: String
    val password: String
    fun isValid(): Int
}