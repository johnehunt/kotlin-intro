package com.jjh.functions

// In Kotlin functions can be declared at top level in a file,
// meaning you do not need to create a class to hold a function,
// which you are required to do in languages such as Java, C# or Scala.
// In addition to top level functions, Kotlin functions can be local functions,
// as member functions and extension functions.

// Unit is optional
fun printHello(): Unit {
    println("Hello")
}

fun printMessage(message: String) {
    println(message)
}

fun printHello2() {
    println("Hello")
}

// Functions returning a value
// Must specify the return type -
// otherwise assumed to be Unit
fun double(x: Int): Int {
    return 2 * x
}

fun add(x: Int, y: Int): Int {
    return x + y
}

// Function parameters can have default values
fun increment(x: Int, y: Int = 1): Int {
    return x + y
}

// Functions can have variable length arguments
fun printer(vararg strings: String) {
    println(strings)
}
// Note Only one parameter may be marked as vararg.
// If a vararg parameter is not the last one in the list,
// values for the following parameters can be passed using
// the named argument syntax, or, if the parameter has a
// function type, by passing a lambda outside parentheses.

// Single Expression Functions - have short hand form
// Note = is required between parameter list and expression
fun tripler(x: Int): Int = x * 3

fun tripler2(x: Int) = x * 3

// Inline functions - compiler tries to inline function
inline fun calculate(): Int = 2 + 3


