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
 * Class used to encapsulate extensions
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

// Infix operators
// Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). Infix functions must satisfy the following requirements:
//
// * They must be member functions or extension functions;
// * They must have a single parameter;
// * The parameter must not accept variable number of arguments and must have no default value.

infix fun String.m(len: Int): String {
    var result: String = ""
    for (i in 0..len) {
        result += this
    }
    return result
}
