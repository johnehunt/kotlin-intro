package com.jjh.control

/**
 * Illustrates a Kotlin when statement - similar
 * to case or switch statement in other languages.
 */
fun main(args: Array<String>) {
    val value = 1
    when (value) {
        0 -> println("its a 0")
        1 -> println("its a 1")
        else -> println("Default")
    }
}