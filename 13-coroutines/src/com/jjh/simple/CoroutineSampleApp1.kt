package com.jjh.simple

import kotlinx.coroutines.*

fun main() {

    println("Launching fire-and-forget task")
    GlobalScope.launch {
        println("Starting Task")
        delay(5000)
        println("Done Task")
    }
    println("After launching coroutine")
    println("Waiting for task - press enter to continue:")
    readLine()
    println("Done")
}

