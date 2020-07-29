package com.jjh.higher

typealias IntFunction = (Int) -> Int

object HigherOrderApp2 {

    // Takes a function and an int
    val processor: (Int, IntFunction) -> Int = {x, func -> func(x)}

    @JvmStatic
    fun main(args: Array<String>) {
        println(processor(5, increment))
        println(processor(5, { x -> x + 1 }))
        // Trailing lambda syntax
        println(processor(5) { x -> x + 1 })
        // it: implicit name fo a single parameter
        println(processor(5) { it + 1 })
    }

    val increment: IntFunction = fun(i: Int): Int {
        return i + 1
    }
}