package com.jjh.ops

data class Quantity(val value: Int) {
    infix fun add(i: Int): Quantity = Quantity(value + i)
    infix fun sub(i: Int): Quantity = Quantity(value - +i)
}

fun main() {
    val q1 = Quantity(5)
    println("q1 add 5: ${q1 add 5}")
    println("q1 sub 5: ${q1 sub 5}")
}