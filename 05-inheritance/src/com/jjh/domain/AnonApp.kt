package com.jjh.domain

open class LogIt {
    fun log() = println("log")
}

fun main() {
    val obj = object : LogIt() {
        var x: Int = 0
        val y = 42
    }
    println(obj)
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.log()
}