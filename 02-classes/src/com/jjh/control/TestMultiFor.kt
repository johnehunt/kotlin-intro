package com.jjh.control

fun main(args: Array<String>) {
    println("Starting")
    for (i in 0..9) {
        for (j in 10 downTo 1) {
            println(i.toString() + "\t" + j)
        }
    }
    println("Done")
}