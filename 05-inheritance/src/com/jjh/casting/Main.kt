package com.jjh.casting

class Person()

fun main() {
    val any: Any = "Hello"
    if (any is String) {
        println(any.length)
    }

    if (any !is String) { // same as !(obj is String)
        println("Not a String")
    }

    // Using an 'unsafe' cast
    val message: String = any as String
    println(message)

    // val p: Person = any as Person
    // println(p)

    val p: Person? = any as? Person
    println(p)

}