package com.jjh.closure

object ClosureSampleApp {

    @JvmStatic
    fun main(args: Array<String>) {
        var more = 100
        val func: (Int) -> Int = { i -> i + more }

        println(func(10))
        more = 50
        println(func(10))
    }

}