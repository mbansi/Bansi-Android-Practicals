package com.example.javakotlin.javakotlinoverview.kotlin

class OperatorsWithWhen {
    fun main(args: Array<String>) {
        var a = 15
        var b = 5

        println("Enter your choice of operation:")
        println("1.Add")
        println("2.Subtract")
        println("3.Multiply")
        println("4.Divide")
        println("5.Modulus")
        println("6.Increment")
        println("7.Decrement")
        println("8.Equal to")
        println("9.Not equal to")
        println("10.Greater than")
        println("11.Bitwise and")
        println("12.Bitwise or")
        println("13.Bitwise Xor")
        println("14.Complement")
        println("15.Left shift")
        println("16.Right Shift")

        when(14) {
            1 -> println("Addition = ${a+b}")
            2 -> println("Subtraction = ${a-b}")
            3 -> println("Multiplication = ${a*b}")
            4 -> println("Division = ${a/b}")
            5 -> println("Modulus = ${a%b}")
            6 -> println("Increment a = ${a++}")
            7 -> println("Decrement a = ${a--}" )
            8 -> println("Equals: ${a==b}" )
            9 -> println("Not Equals: ${a!=b}" )
            10 -> println("Greater than: ${a>b}" )
            11 -> println("Bitwise and result: ${a and b}" )
            12 -> println("Bitwise or result: ${a or b}" )
            13 -> println("Bitwise Xor result: ${a xor b}")
            14 -> println("Complement a: ${a.inv()}" )
            15 -> println("Left shift a: ${a shl 2}" )
            16 -> println("Right shift a: ${a shr 2}")
            else -> println("invalid choice")
        }
    }
}