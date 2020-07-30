package com.jjh.ops

data class Counter(var value: Int) {

    operator fun plus(increment: Int): Counter = Counter(value + increment)
    operator fun plus(other: Counter): Counter = Counter(value + other.value)
    operator fun minus(decrement: Int): Counter = Counter(value - decrement)
    operator fun minus(other: Counter): Counter = Counter(value - other.value)

    operator fun plusAssign(c: Counter) {
        value += c.value
    }
}

fun main() {

    val c1 = Counter(1)
    println("c1 + 2: ${c1 + 2}")
    println("c1 - 2: ${c1 - 2}")

    val c2 = Counter(5)
    println("c1 + c2: ${c1 + c2}")
    println("c1 - c2: ${c1 - c2}")

    c2 += c1
    println("c2 += c1: $c2")

}