package com.jjh.extensions

object StringExtApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = "John"
        println(s.hasLength(4))
        println("-".mult(25))

        println(s.size)

        val obj = MyClass()
        obj.printMe("Hello")
    }
}