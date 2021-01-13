package com.jjh.anon

fun main() {

    // Defines a new object which is anonymous
    val obj = object {
        var x: Int = 0
        val y = 42
    }

    // Use single instance of anonymous object
    println(obj)
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.x = 50
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
}