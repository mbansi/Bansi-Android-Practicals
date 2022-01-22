package com.example.javakotlin.javakotlinoverview.kotlin

enum class DEPARMTMENT {
    IT, SALES, MARKETING, FINANCE
}

class Enumeration {
    fun main() {
        var dept = 1
        for (dept in DEPARMTMENT.values()) {
            println("${dept.ordinal} = ${dept.name}")
        }
    }
}

