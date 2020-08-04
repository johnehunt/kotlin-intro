package com.jjh.sam

fun main() {
    val runnable : Runnable = Runnable { print("I am a runnable")}
    runnable.run()
}