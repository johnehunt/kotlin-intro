package com.jjh.extensions

/**
 * Extension Functions - aka Pimp My type
 */
fun String.hasLength(len: Int) = this.length == len

fun String.mult(len: Int): String {
    var result: String = ""
    for (i in 0..len) {
        result += this
    }
    return result
}

/**
 Extension Properties
 */
val String.size get() = this.length

/**
 * CLass used to encapsulate extensions
 */
class MyClass {
    // Extension function for a String
    // But only accessible from within class
    fun String.rev(): String {
        return this.reversed()
    }
    fun printMe(s: String) {
        println(s.rev())
    }
}

/**
 * Can also encapsulate extensions within an object
 */
object MyObject {
    fun String.rev(): String {
        return this.reversed()
    }
    fun printMe(s: String) {
        println(s.rev())
    }
}