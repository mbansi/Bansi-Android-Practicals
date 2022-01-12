package com.example.javakotlin.javakotlinoverview.kotlin

class PersonFM (var name: String, var age: Int) {
}
fun main(args: Array<String>) {
    val numberList = listOf(1,3,5,6,8,9,10,15,20)

    val smallNumberList = numberList.filter{ n -> n<10 }
    println(smallNumberList)

    val squareNumberList = numberList.map{ n -> n*n }
    println(squareNumberList)

    var people = listOf<PersonFM>(PersonFM("Bansi",21), PersonFM("ABC",28), PersonFM("BCD",35))
    var bNames = people.filter{ it.name.startsWith("B") } .map{ it.name }
    println(bNames)
}