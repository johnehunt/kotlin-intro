package com.jjh.simple

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

val channel = Channel<Int>()

suspend fun channelTask() {
    GlobalScope.launch{
        performChannelTask1()
    }

    GlobalScope.launch {
        performChannelTask2()
    }
}

suspend fun performChannelTask1() {
    for (i in 1..6) {
        delay(100)
        println("Sending $i")
        channel.send(i)
    }
}

suspend fun performChannelTask2() {
    repeat(6) {
        println("Received: ${channel.receive()}")
    }
}

fun main() {
    println("Launching channel task")
    GlobalScope.launch {
        channelTask()
    }
    println("After launching coroutines")
    println("Waiting for task - press enter to continue:")
    readLine()
    println("Done")
}