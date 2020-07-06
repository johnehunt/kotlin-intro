package com.jjh.lambdas

object SampleLambdaApp {

    @JvmStatic
    fun main(args: Array<String>) {
        // Lambda expression
        val func1: (Int) -> Int = { i -> i + 1 }
        println("func1(5): ${func1(5)}")
        // An anonymous function
        val func2 = fun(i: Int): Int {return i + 1}
        println("func2(5): ${func2(5)}")
        // A callable reference to a member function
        val func3: (String) -> Int = String::toInt
        println("funcs('3'): ${func3("3")}")
        // A bound callable reference
        val func4: () -> Int = "4"::toInt
        println("func4(): ${func4()}")
    }
}