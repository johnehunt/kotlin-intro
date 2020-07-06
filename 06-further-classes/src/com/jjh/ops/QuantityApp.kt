package com.jjh.ops

data class Quantity(val value: Int) {
    infix fun add(i: Int): Quantity {
        return Quantity(value + i)
    }
}

data class Counter(var index: Int) {
    operator fun plus(increment: Int): Counter {
        return Counter(index + increment)
    }
    operator fun plusAssign(c: Counter) {
        index = index + c.index
    }
}

object QuantityApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val q1 = Quantity(5)
        println(q1 add 5)

        println("------")

        val c1 = Counter(1)
        println(c1 + 2)

        val c2 = Counter(5)
        c2 += c1
        println(c2)


    }
}