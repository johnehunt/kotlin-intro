package com.jjh.callableref

fun increase(i: Int) = i + 1

fun main() {
    println(increase(5))
    val inc = ::increase
    println(inc)
    println(inc(5))
}