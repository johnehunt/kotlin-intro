package com.jjh.control

object TestIf {
    @JvmStatic
    fun main(args: Array<String>) {
        val i = 5
        val j = 10
        // Can have any number of if else and optional else
        if (i < j) {
            println(i)
        } else {
            println(j)
        }
    }
}