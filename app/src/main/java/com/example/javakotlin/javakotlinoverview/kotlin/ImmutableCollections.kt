package com.example.javakotlin.javakotlinoverview.kotlin

class ImmutableCollections {
    fun main(args: Array<String>) {
        val listCollection = listOf("Android","Xcode","Git","Android")
        for(item in listCollection) {
            println(item)
        }

        var setCollection = setOf("Android",10,"Xcode")
        for(item in setCollection) {
            println(item)
        }

        var mapCollection = mapOf(101 to "ABC",102 to "DEF")
        for(key in mapCollection.keys) {
            println(mapCollection[key])
        }
    }
}