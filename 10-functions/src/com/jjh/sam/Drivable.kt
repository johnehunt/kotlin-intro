package com.jjh.sam

fun main() {
    val runnable = Runnable { print("I am a runnable")}
    runnable.run()
}