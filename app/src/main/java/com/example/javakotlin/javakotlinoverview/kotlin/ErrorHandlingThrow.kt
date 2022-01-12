package com.example.javakotlin.javakotlinoverview.kotlin

class ErrorHandlingThrow {
    fun main(args: Array<String>) {
        checkPassword("bansi")
    }
    fun checkPassword(password: String) {
        if (password.length < 6)
            throw ArithmeticException("Password is too short")
        else
            println("Strong password")
    }
}