package com.example.javakotlin.javakotlinoverview.kotlin

open class PersonSF {
    var name: String? = null
    var age: Int = 0
    var status: String? = null
}

fun main(args: Array<String>) {

    val person = PersonSF().apply {
        name = "Bansi"
        age = 21
    }

    val nameLength = person.name?.let {
        it.length
    }
    println("Name length = $nameLength")

    with(person) {
        print(name)
        print(age)
        status = "Studying"
        println(status)
    }

    person.also {
        it.age += 5
        it.status = "Graduated"
    }

    with(person) {
        print(name)
        print(age)
        println(status)
    }

    var person2 = PersonSF()
    person2.apply {
        name="ABC"
        age = 20
    }

    person2.run {
        print(name)
        print(age)
    }
}