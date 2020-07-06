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

        // Infix oeprator example
        println("-" m 25)
        // same as
        println("-".m(25))

        // Note infix function calls have
        // lower precedence than arithmetic operators
        println("-" m 2 + 3) // same as "-" m 5

    }
}