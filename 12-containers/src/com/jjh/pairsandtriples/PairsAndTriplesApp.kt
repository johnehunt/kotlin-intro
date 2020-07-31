package com.jjh.pairsandtriples

fun main() {
    val pair1 = Pair<Int, String>(1, "John")
    val pair2 = Pair(2, "Denise")
    val pair3 = Pair("Adam", "Jasmine")

    println(pair1)
    println(pair2)
    println(pair3)

    println(pair1.first)
    println(pair1.second)

    println(pair1.copy(first = 3))
    println(pair1)

    println("-----")

    val triple1 = Triple<Int, String, String>(1, "John", "Denise")
    println(triple1)

    val triple2 = Triple(1, "John", "Denise")
    println(triple2)
    println(triple2.first)
    println(triple2.second)
    println(triple2.third)

}