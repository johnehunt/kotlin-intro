package com.jjh.queue

import kotlin.collections.*

fun main() {
    val numbers = ArrayDeque(listOf(1, 2, 3))
    println(numbers)

    val names = ArrayDeque<String>(5)
    names.add("John")
    names.add("Denise")
    names.add("Adam")

    println(names)
    println(names.size)
    println(names.first())
    println(names.last())

    println(names.removeFirst())
    println(names)
}