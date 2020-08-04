package com.jjh.higher

class Calculator {
    fun execute(x: Int, func: (Int) -> Int): Int {
        return func(x)
    }
}

fun main() {
    val calc = Calculator()
    val result = calc.execute(5) { it + 1 }
    println("result: $result")
}