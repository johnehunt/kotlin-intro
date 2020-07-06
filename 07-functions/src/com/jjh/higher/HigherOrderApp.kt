package com.jjh.higher

object HigherOrderApp {

    // Takes a function and an int
    val processor: (Int, (Int) -> Int) -> Int = {x, func -> func(x)}

    @JvmStatic
    fun main(args: Array<String>) {
        println(processor(5, increment))
        println(processor(5, { x -> x + 1 }))
        // Trailing lambda syntax
        println(processor(5) { x -> x + 1 })
        // it: implicit name fo a single parameter
        println(processor(5) { it + 1 })
    }

    val increment = fun(i: Int): Int {
        return i + 1
    }
}