package com.jjh.domain

open class Logger {
    fun log() = println("log")
}

object HelloWorldLogger : Logger() {
    fun doSomething() = log()
}

fun main(){
    HelloWorldLogger.doSomething()
}