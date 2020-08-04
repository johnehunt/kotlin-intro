package com.jjh.control

/**
 * Illustrates a Kotlin when statement - similar
 * to case or switch statement in other languages.
 */
fun main(args: Array<String>) {
    val value = 1
    when (value) {
        0 -> println("It is a 0")
        1, 2 -> println("It is a 1 or 2")
        3 -> println("It is to high")
        else -> println("Default")
    }

    var result = when(value) {
        0 -> "Invalid number"
        1, 2 -> "Number too low"
        3 -> "Number correct"
        4 -> "Number too high, but acceptable"
        in 5..10 -> "Number too high, might be acceptable"
        !in 10..Int.MAX_VALUE -> "What are you on"
        else -> "Bad number"
    }
    println("result: $result")

    var x: Any = 32
    when (x) {
        is Int -> println("Its a number")
        is String -> println("Its a String")
        else -> println("its something else")
    }

}