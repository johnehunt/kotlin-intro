package com.jjh.sam

fun main() {
    val runnable = Runnable { print("I am a runnable")}
    Thread(runnable).start()
    println("Press return to exit")
    readLine()
}