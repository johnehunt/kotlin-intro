package com.jjh.higher

object HigherOrder {

    // Takes a function and an int
    val processor: (Int, (Int) -> Int) -> Int = {x, func -> func(x)}

}

fun main() {

    val increment = fun(i: Int)= i + 1
    println(HigherOrder.processor(5, increment))

    // Long hand form
    println(HigherOrder.processor(5, { x -> x + 1 }))

    // Trailing lambda syntax - preferred Kotlin style
    println(HigherOrder.processor(5) { x -> x + 1 })

    // it: implicit name for a single parameter
    println(HigherOrder.processor(5) { it + 1 })
}