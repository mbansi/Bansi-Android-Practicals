package com.example.javakotlin.javakotlinoverview.kotlin

interface MobileDepartment {
    fun getIDE() : String
    fun message(){
        println("This is mobile department")
    }
}

class Bansi : MobileDepartment {
    override fun getIDE() = "Android Studio"
}

class ABC : MobileDepartment {
    override fun getIDE() = "Xcode"
}

fun main(args: Array<String>) {
    val b = Bansi()
    println("Working in ${b.getIDE()}")
    b.message()

    val abc = ABC()
    println("Working in ${abc.getIDE()}")
    abc.message()
}