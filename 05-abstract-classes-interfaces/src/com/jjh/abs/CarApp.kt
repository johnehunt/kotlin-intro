package com.jjh.abs

object CarApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val c: Conveyance = Car()
        c.startup()
    }
}