package com.example.javakotlin.javakotlinoverview.kotlin

class IfPlusForLoop {
    fun main(args: Array<String>) {
        for(i in 1..10) {
            if(i%2 == 0) {
                println("$i divisible by 2")
            }
            else {
                continue
            }
        }
    }
}