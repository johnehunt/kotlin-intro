package com.jjh.lambdas

fun main() {

    var increase: (Int) -> Int = {x: Int -> x + 1}
    // var increase: (Int) -> Int = {x -> x + 1}
    println("increase: $increase")
    println("increase(5): ${increase(5)}")

    val increment = increase
    println("increase using increment:  ${increment(2)}")

    increase = {x -> x + 99}
    val y = increase(10)
    println("2nd Increased y: $y")

    // An anonymous function
    val func1 = fun(i: Int): Int { return i + 1 }
    println("func1(5): ${func1(5)}")
    val func1a = fun(i: Int) = i + 1
    println("func2a(5): ${func1a(5)}")

    // Lambda expression - last expression implicitly returned
    val func2: (Int) -> Int = { i -> i + 1 }
    println("func2(5): ${func2(5)}")

    // A callable reference to a method on class String
    val func3: (String) -> Int = String::toInt
    println("funcs('3'): ${func3("3")}")

    // A bound callable reference
    val func4: () -> Int = "4"::toInt
    println("func4(): ${func4()}")

    // If a lambda param is unused can use underscore (since 1.1)
    // map.forEach { _, value -> println("$value!") }
}