package com.jjh.interfaces

class Person : Speaker {
    override fun saySomething() {
        println("Person - Howdy")
    }
}

fun main(args: Array<String>) {
    val p = Person()
    p.sayHello()
    p.saySomething()
}