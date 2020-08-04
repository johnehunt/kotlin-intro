package com.jjh.arrays

fun main() {
    val names = arrayOf("John", "Denise", "Adam", "Phoebe")
    println("first(): ${names.first()}")
    println("last(): ${names.last()}")
    println("copyOf(): ${names.copyOf()}")
    println("sliceArray(2..3): ${names.sliceArray(2..3)}")
}