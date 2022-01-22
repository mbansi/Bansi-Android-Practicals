package com.example.javakotlin.javakotlinoverview.kotlin

abstract class Abstract {
    fun myMethod(){
        println("Hello")
    }

    abstract fun  anotherMethod();
}

class Demo : Abstract() {
    override fun anotherMethod() {
        println("Abstract method");
    }
}
fun main(args: Array<String>) {
    var demo : Abstract = Demo()
    demo.myMethod()
    demo.anotherMethod()
}