package com.jjh.props

fun main(args: Array<String>) {
    val obj = GameObject()
    println(obj.x)
    obj.x = 10
    println(obj.x)
    println(obj.isHome)
    println(obj.background)
}