package com.example.javakotlin.javakotlinoverview.kotlin

class MutableCollections {
    fun main(args: Array<String>) {
        val listCollection = mutableListOf("Android","Xcode","Git","Android")
        listCollection[3]  = "Flutter"
        for(item in listCollection) {
            println(item)
        }

        var setCollection = mutableSetOf<Int>(2,10)
        setCollection.add(5)
        for(item in setCollection) {
            println(item)
        }

        var mapCollection = mutableMapOf<Int,String>(101 to "ABC",102 to "DEF")
        mapCollection.put(103,"GHI")
        for(key in mapCollection.keys) {
            println(mapCollection[key])
        }
    }
}