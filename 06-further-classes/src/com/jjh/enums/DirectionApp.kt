package com.jjh.enums

object DirectionApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val d = Direction.NORTH
        println(d)
        if (d === Direction.NORTH) {
            println("We are heading North")
        }
    }
}