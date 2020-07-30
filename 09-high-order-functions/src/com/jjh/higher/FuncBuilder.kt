package com.jjh.higher

object FuncBuilder {

    fun build(x: Int): (Int) -> Int {
        val func = fun(y: Int) = x+y
        return func
    }

}

fun main() {
    val func = FuncBuilder.build(5)
    val result = func(3)
    println("result: $result")
}