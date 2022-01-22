package com.example.javakotlin.javakotlinoverview.kotlin

fun main(args: Array< String>) {
    val str: Any = "Bansi"
    val forString: String? = str as? String
    val forInt: Int? = str as? Int
    println(forString)
    println(forInt)
}