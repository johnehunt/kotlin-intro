package com.jjh.domain

fun main() {
    var e: Employee = Employee("John", 55, 1234)
    var d: Developer = Developer("Eloise", 25, 5432)
    val s = Sales("Adam", 20, 3456)
    e = d
    e = s

//        d = s
//        s = d

    // Cast whatever is held in e to a Developer
    // If e does not hold a reference to a Developer
    // then a CLassCastException will be thrown
    d = e as Developer
}