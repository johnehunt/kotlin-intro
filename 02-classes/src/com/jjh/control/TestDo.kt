package com.jjh.control

object TestDo {
    @JvmStatic
    fun main(args: Array<String>) {
        var i = 0
        val j = 10
        do {
            println(i)
            i++
        } while (i < j)
    }
}