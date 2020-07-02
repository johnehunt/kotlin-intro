package com.jjh.control

object TestFor {
    @JvmStatic
    fun main(args: Array<String>) {

        for (i in 0..9) {
            println(i)
        }

        for (x in 0 until 10) println(x) // Prints 0 through 9
        for (x in 0 until 10 step 2) println(x) // Prints 0, 2, 4, 6, 8
    }
}