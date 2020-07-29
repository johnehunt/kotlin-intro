package com.jjh.people

fun main() {
    val p1 = Person("John", 54)
    println(p1)
    println(p1.name + " is " + p1.age)
    p1.age = 55
    // p.name = "Bob" // Compilation error as name is a read only val
    println(p1.name + " is " + p1.age)
    println(p1)

    val p2 = Person("Denise", 52)
    val p3 = Person("Phoebe", 22)
    val p4 = Person("Adam", 20)

    println(p2)
    println(p3)
    println(p4)
}