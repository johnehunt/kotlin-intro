package com.jjh.domain

fun main() {
    var e: Employee = Employee("John", 55, 1234)
    var s: Sales = Sales("Adam", 20, 3456)
    e = s
    println(e)
    // Following is allowed as Kotlin does a Smart Cast
    // Compiler tracks what is in e to see if this is legal
    s = e
    println(s)
}