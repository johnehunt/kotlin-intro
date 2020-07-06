package com.jjh.main

import com.jjh.util.Person

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val p = Person("John", 55)
        println(p)
    }
}