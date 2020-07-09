package com.jjh.people

fun main(args: Array<String>) {
    // Has zero param constructor generated
    val p1 = Person3()
    println(p1)
    val p2 = Person3("John", 21)
    println("${p2.name} is ${p2.age}")

    p2.birthday()

    println("${p2.name} is ${p2.age}")
}