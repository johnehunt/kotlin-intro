package com.jjh.control

fun main() {
    println("Starting")

    for (i in 0..5) {
        for (j in 5 downTo 0) {
            print("$i * $j = ${i*j}; ")
        }
        println()
    }

    println("Done")
}