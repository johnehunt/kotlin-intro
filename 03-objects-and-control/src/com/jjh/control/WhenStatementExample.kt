package com.jjh.control

class Person

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

    val value2 = "John"
    when (value2) {
        "John" -> println("Dad")
        "Denise" -> println("Mum")
        else -> println("Not mum or dad")
    }

    val person = Person()
    val person1 = person
    when (person1) {
        person -> println("its me")
        else -> println("its not me")
    }

    val x: Any = 32
    when (x) {
        is Int -> println("Its a number")
        is String -> println("Its a String")
        is Person -> println("Its a Person")
        else -> println("its something else")
    }

    val total = 34
    when (total) {
        0 -> {
            print("Its Zero")
            println("Never mind")
        }
        in 1..5 -> println("Not Bad")
        else -> println("Excellent")
    }

}