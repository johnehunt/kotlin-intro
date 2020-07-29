package com.jjh.anon

fun main() {
    val obj = object {
        var x: Int = 0
        val y = 42
    }
    println(obj)
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.x = 50
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
}