package com.example.javakotlin.javakotlinoverview.kotlin

data class Dog(val name: String, val furColor: String)
data class Cat(val name: String, val eyesColor: String)
class Cage<A>(var animal: A, val size: Double)

fun main(args: Array<String>) {
    val dog: Dog = Dog(name = "Tuffy", furColor = "White")
    val cat: Cat = Cat(name = "Browny", eyesColor = "Green")
    val cageDog: Cage<Dog> = Cage(animal = dog, size = 6.0)
    val cageCat: Cage<Cat> = Cage(animal = cat, size = 3.0)
    println("${dog.name} requires cage size of ${cageDog.size} inches" )
    println("${cat.name} requires cage size of ${cageCat.size} inches" )
}