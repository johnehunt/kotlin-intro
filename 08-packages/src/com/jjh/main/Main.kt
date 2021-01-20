package com.jjh.main

import com.jjh.util.Person
import com.jjh.util.Course.presentation
import com.jjh.util.add
import com.jjh.util.CardTypes.GOLD

fun main() {
    val p = Person("John", 55)
    println(p)

    presentation()

    println(add(4, 5))

    val cardType = GOLD
}