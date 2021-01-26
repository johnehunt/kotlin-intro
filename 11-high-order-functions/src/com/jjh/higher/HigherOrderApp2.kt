package com.jjh.higher

/**
 * Member functions can also be higher order
 */
object Math {
    fun processor(x: Double, y: Double, func: (Double, Double) -> Double): Double {
        return func(x, y)
    }

    fun processor(x: Int, func: (Int) -> String): String {
        return func(x)
    }
}


typealias IntFunction = (Int) -> Int

object HigherOrder {
    // Takes a function and an int
    fun processor(x: Int, func: IntFunction): Int {
        return func(x)
    }
}

fun main() {

    val converter = fun(i: Int)= i.toString()
    println(Math.processor(5, converter))

    // Long hand form
    println(HigherOrder.processor(5, { x -> x + 1 }))

    // Trailing lambda syntax - preferred Kotlin style
    println(HigherOrder.processor(5) { x -> x + 1 })

    // it: implicit name for a single parameter
    println(HigherOrder.processor(5) { it + 1 })
}