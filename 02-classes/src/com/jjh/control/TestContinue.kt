package com.jjh.control

object TestContinue {
    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 0..4) {
            for (j in 0..4) {
                val result = i + j
                if (result == 6) continue
                println("$i, $j = $result")
            }
        }

        println("----------------");

        outer@ for (i in 1..4) {
            for (j in 1..4) {
                val result = i + j
                if (result == 6) continue@outer
                println("$i, $j = $result")
            }
        }
    }
}