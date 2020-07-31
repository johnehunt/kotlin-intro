package com.jjh.simple

import kotlinx.coroutines.*

fun startTask() {
    println("Launching fire-and-forget task")
    GlobalScope.launch {
        performTasks()
    }
    println("After launching coroutine")
}

suspend fun performTasks() {
    performTask1()
    withContext(Dispatchers.IO){performTask2()}
    performTask3()
}

suspend fun performTask1() {
    println("Task 1: ${Thread.currentThread().name}")
}

suspend fun performTask2() {
    println("Task 2: ${Thread.currentThread().name}")
}

suspend fun performTask3() {
    println("Task 3: ${Thread.currentThread().name}")
}

fun main() {
    startTask()
    println("Waiting for task - press enter to continue:")
    readLine()
    println("Done")
}