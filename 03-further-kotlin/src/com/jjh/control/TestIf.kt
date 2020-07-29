package com.jjh.control

fun main(args: Array<String>) {
    // Can have any number of if else and optional else
    val i = 5
    val j = 10
    if (i < j) {
        println(i)
    } else if (i == j) {
        println("The Same")
    } else {
        println(j)
    }

    val name = "John"
    val role = if (name == "John")
        "Dad"
    else
        "No Data"
    println("$name is $role")

}
