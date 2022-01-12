package com.example.javakotlin.javakotlinoverview.kotlin

data class Human(var name:String, var age:Int);

lateinit var human: Human

fun main(args: Array<String>) {
    human = Human("Bansi",21)
    print("${human.name} is ${human.age} years old")
}

