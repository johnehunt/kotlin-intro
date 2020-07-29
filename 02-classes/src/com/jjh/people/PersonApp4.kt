package com.jjh.people

fun main() {
    val p1 = Person4("John")
    println("${p1.name} has partner ${p1.partner}")
    val p2 = Person4("Denise")
    p1.partner = p2
    println("${p1.name} has partner ${p1.partner}")

    // Can use secondary constructor for this
    val p3 = Person4("Phoebe", 23, Person4("Gryff"))
    println("${p3.name} has partner ${p3.partner}")
}
