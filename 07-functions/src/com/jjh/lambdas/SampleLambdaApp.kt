package com.jjh.lambdas

object SampleLambdaApp {

    @JvmStatic
    fun main(args: Array<String>) {
        val func1: (Int) -> Int = { i -> i + 1 }
        println("func1(5): ${func1(5)}")
    }
}