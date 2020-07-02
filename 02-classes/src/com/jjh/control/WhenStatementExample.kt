package com.jjh.control

object WhenStatementExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val value = 1
        when (value) {
            0 -> println(0)
            1 -> println(1)
            else -> println("Default")
        }
    }
}