package com.jjh.closure

var increment: (Int) -> Int = { x -> x + 3 }

fun main() {
    println(increment(5))
    resetFunc()
    println(increment(5))
}

fun resetFunc() {
    // Local val is bound and stored in function
    // as it is used within the function body
    val addition = 50
    increment = { a -> a + addition }
}