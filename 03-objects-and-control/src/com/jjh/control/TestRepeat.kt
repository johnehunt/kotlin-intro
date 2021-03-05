package com.jjh.control

fun main() {
    repeat(3) {
        print("Hello, ")
    }
    println()
    repeat(3) {
        print("Hello $it, ")
    }
    println()
}