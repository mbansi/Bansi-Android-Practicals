package com.example.javakotlin.javakotlinoverview.kotlin

fun main(args: Array<String>) {
    functionTest { s, i ->
        var temp: String = ""
        for (num in 1..i) {
            temp += s
        }
        temp
    }
}

fun functionTest(function: (String, Int) -> String) {
    val s: String = function("Bansi ", 3)
    println(s)
}
