package com.jjh.control

fun main() {
    // Requires Kotlin 1.4 to work
    for (i in 0..10) {
        when (i) {
            2 -> continue
            4 -> break
            else -> println(i)
        }
    }
}
