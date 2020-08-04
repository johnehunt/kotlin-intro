package com.jjh.arrays

fun main() {
    val family = arrayOf (
            arrayOf("John", "Denise", "Phoebe", "Adam"),
            arrayOf("Paul", "Fi", "Andrew", "James", "Joselyn")
    )
    println("family: $family")
    println("family.length: ${family.size}")
    println("family(0).length: ${family[0].size}")
    println("family(1).length: ${family[1].size}")
}