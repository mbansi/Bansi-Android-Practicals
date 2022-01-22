package com.example.javakotlin.javakotlinoverview.kotlin

class IDEManager {
    companion object {
        fun getIDE(person: PersonL): List<String> {
            println("IDE for ${person.name}")
            return listOf("XCode", "Android Studio")
        }
    }
}
data class PersonL(val name: String) {
    val ide by lazy { IDEManager.getIDE(this) }
}

fun main(args: Array<String>) {
    val person = PersonL("Bansi")
    println(person.ide)
}