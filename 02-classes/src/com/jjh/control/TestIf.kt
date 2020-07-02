package com.jjh.control

object TestIf {
    @JvmStatic
    fun main(args: Array<String>) {
        val i = 5
        val j = 10
        if (i < j) {
            println(i)
        } else {
            println(j)
        }
    }
}