package com.jjh.higher

fun processor(x: Int, func: (Int) -> Int): Int {
    return func(x)
}


fun main() {

    val increment = fun(i: Int)= i + 1
    println(processor(5, increment))

    // Long hand form
    println(processor(5, { x -> x + 1 }))

    // Trailing lambda syntax - preferred Kotlin style
    println(processor(5) { x -> x + 1 })

    // it: implicit name for a single parameter
    println(processor(5) { it + 1 })
}