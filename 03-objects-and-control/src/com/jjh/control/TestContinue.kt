package com.jjh.control

fun main() {
    for (i in 0..4) {
        for (j in 0..4) {
            val result = i + j
            if (result == 6) continue
            print("$i, $j = $result; ")
        }
    }

    println("----------------")

    outer@ for (i in 1..4) {
        for (j in 1..4) {
            val result = i + j
            if (result == 6) continue@outer
            print("$i, $j = $result; ")
        }
    }
}
