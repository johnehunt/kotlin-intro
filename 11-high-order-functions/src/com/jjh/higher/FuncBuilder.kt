package com.jjh.higher

object FuncBuilder {

    fun build(x: Int): (Int) -> Int {
        val func = fun(y: Int) = x + y
        return func
    }

}

fun main() {
    val increment = FuncBuilder.build(1)
    val result = increment(3)
    println("result: $result")

    val addTwo = FuncBuilder.build(2)
    val result1 = addTwo(3)
    println("result1: $result1")
}