package com.jjh.inner

object CalculateFibApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val fib = CalculateFib()
        fib.printFibSequence(5)
    }
}