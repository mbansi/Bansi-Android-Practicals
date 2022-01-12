package com.example.javakotlin.javakotlinoverview.kotlin

open class Person(name: String,age: Int) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class Student(name: String,age: Int): Person(name,age) {
    fun getCourse() {
        println("My course is btech")
    }
}

class WorkingMan(name: String,age: Int): Person(name,age) {
    fun getOccupation() {
        println("I work as a salesman")
    }
}
class Inheritance {
    fun main(args: Array<String>) {
        val s = Student("Bansi",20)
        s.getCourse()

        println()

        val w = WorkingMan("ABC", 40)
        w.getOccupation()
    }
}
