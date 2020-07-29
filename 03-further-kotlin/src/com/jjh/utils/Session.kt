package com.jjh.utils

class Session(val id: Int) {

    companion object {
        private val MAX = 100
        private var counter = 0
        private fun next() = counter++

        // Factory method
        fun create(): Session {
            next()
            return Session(counter)
        }

    }

    override fun toString(): String = "Session[$id]"
    fun printInfo(): Unit = println(MAX)
}

fun main() {
    val s1 = Session.create()
    println(s1)
    s1.printInfo()
}