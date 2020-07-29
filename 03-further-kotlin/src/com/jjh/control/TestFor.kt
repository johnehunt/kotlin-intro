package com.jjh.control

fun main() {

    // Represents a loop from 0 to (and including) 9
    for (i in 0..9) {
        print("$i, ")
    }

    println("------------")

    // If want to print up until a number (but not including it)
    // then you must use the until operation
    for (x in 0 until 9) print("$x, ") // Prints 0 through 9

    println("------------")

    for (x in 0 until 9 step 2) print("$x, ") // Prints 0, 2, 4, 6, 8

    println("------------")

}