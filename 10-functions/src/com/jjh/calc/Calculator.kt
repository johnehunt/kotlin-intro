package com.jjh.calc

class Calculator {
    // method defined as part of class
    fun max(x: Int, y: Int): Int {
        return if (x > y) x else y
    }

    // Function defined in class
    val increment: (Int) -> Int = { x -> x + 1 }
}

fun main() {
    val calc = Calculator()
    val a = calc.max(2, 3)
    println(a)
    val b = calc.increment(3)
    println(b)
    val func = calc.increment
    val c = func(3)
    println(c)
}
