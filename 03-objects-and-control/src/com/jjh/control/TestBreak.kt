package com.jjh.control

fun main() {
    val y = 10
    val x = 5

    for (i in 0 until y) {
        if (i == x) {
            break
        }
        print("i: $i, ");
    }
    println()

    println("-------------")

    loop@ for (i in 0 until y) {
        for (j in 0 until x) {
            if (i == x) {
                break@loop
            }
            println("$i \t $j")
        }
    }

}
