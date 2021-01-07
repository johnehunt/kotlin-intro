package com.jjh.model

open class Base {
    open fun print(): Unit = println("Base")
}

class Derived : Base() {
    override fun print() {
        println("Derived before")
        super.print()
        println("Derived After")
    }
}

fun main() {
    val derived = Derived()
    derived.print()
}