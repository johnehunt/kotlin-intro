package com.jjh.domain

open class Person constructor(var name: String = "John",
                          var age: Int = 0) {

    open fun sayHello() {
        println("Hello")
    }

    override fun toString(): String {
        return String.format("Person [age=%s, name=%s]", age, name)
    }

}