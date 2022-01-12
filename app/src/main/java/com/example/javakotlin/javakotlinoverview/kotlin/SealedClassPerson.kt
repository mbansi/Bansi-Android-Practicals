package com.example.javakotlin.javakotlinoverview.kotlin

sealed class SealedClassPerson(val name: String) {
    class Student(val course: String) : SealedClassPerson("Bansi")
    class WorkingMan(val occupation: String) : SealedClassPerson("ABC")
}

fun display(person : SealedClassPerson) {
    when(person){
        is SealedClassPerson.Student -> println("${person.name} is studying ${person.course}")
        is SealedClassPerson.WorkingMan -> println("${person.name} is working as ${person.occupation}")
    }
}

fun main() {
    // Objects of different subclasses created
    val s = SealedClassPerson.Student("Btech")
    val wm = SealedClassPerson.WorkingMan("Salesman")

    display(s)
    display(wm)
}