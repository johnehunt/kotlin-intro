package com.jjh.domain

fun main() {
    var e = Employee("John", 55, 1234)
    var s = Sales("Adam", 20, 3456)
    println(e.calculatePay(40))
    println(s.calculatePay(40))
    e = s
}