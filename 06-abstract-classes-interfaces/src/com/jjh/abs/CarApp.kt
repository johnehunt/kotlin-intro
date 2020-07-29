package com.jjh.abs

fun main(args: Array<String>) {
    val c: Conveyance = Car()
    c.startup()
    val result = c.drive(10)
    println(result)
}