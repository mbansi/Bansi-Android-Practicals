package com.example.javakotlin.javakotlinoverview.kotlin

class ErrorHandlingTryCatchFinally {
    fun main(args: Array<String>) {
        try {
            var myNumbers = arrayOf(1,2,3);
            println(myNumbers[-10]);
        } catch (e: Exception) {
            println("Something went wrong.");
        } finally {
            println("The 'try catch' is finished.");
        }
    }
}