package com.jjh.control

object TestWhile {
    @JvmStatic
    fun main(args: Array<String>) {
        var i = 5
        val j = 10
        while (i < j) {
            println(i)
            i++
        }
    }
}