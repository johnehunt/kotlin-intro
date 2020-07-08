package com.jjh.control

object TestFor {
    @JvmStatic
    fun main(args: Array<String>) {

        // Represents a loop from 0 to (and including) 9
        for (i in 0..9) {
            println(i)
        }

        // If want to print up until a number (but not including it)
        // then you must use the until operation
        for (x in 0 until 10) println(x) // Prints 0 through 9
        for (x in 0 until 10 step 2) println(x) // Prints 0, 2, 4, 6, 8
    }
}