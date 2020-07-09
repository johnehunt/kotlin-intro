package com.jjh.enums

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main(args: Array<String>) {
    val d = Direction.NORTH
    println(d)
    if (d === Direction.NORTH) {
        println("We are heading North")
    }
}