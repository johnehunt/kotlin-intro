package com.jjh.domain

open class Person(var name: String = "John", var age: Int = 0) {

    open fun sayHello() {
        println("Hello")
    }

    override fun toString(): String = "Person [$age, $name]"

}