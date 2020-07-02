package com.jjh.control

object TestBreak {
    @JvmStatic
    fun main(args: Array<String>) {
        val y = 10
        val x = 5
        loop@ for (i in 0 until y) {
            for (j in 0 until x) {
                if (i == x) {
                    break@loop
                }
                println(i.toString() + "\t" + j)
            }
        }
    }
}