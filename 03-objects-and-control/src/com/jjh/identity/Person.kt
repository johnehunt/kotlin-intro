package com.jjh.identity

class Person(val name: String, val age: Int)

fun main() {
    val p1 = Person("John", 21)
    val p2 = Person("John", 21)
    val p3 = p1
    println("p1 === p2: ${p1 === p2}") // checks for reference equality
    println("p1 !== p2: ${p1 !== p2}")
    println("p1 === p3: ${p1 === p3}")
    println("p1 !== p3: ${p1 !== p3}")
}