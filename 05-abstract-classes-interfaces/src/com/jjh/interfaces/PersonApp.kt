package com.jjh.interfaces

object PersonApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val p = Person()
        p.sayHello()
        p.saySomething()
    }
}