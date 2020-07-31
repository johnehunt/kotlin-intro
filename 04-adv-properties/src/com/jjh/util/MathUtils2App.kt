package com.jjh.util

fun main() {
    println(MathUtils2.ZERO)
    println(MathUtils2.MIN)
    println(MathUtils2.MAX)

    MathUtils2.add(2, 3)
    MathUtils2.sub(6, 2)

    // MathUtils.printTitle() // will cause a runtime error as title not yet initialised
    MathUtils2.title = "KVaders"
    MathUtils2.printTitle()

}