package com.jjh.domain

open class Person(var name: String = "John", var age: Int = 0) {

    open fun sayHello() {
        println("Hello")
    }

    /**
     * COnverts instance sof Person to a string
     * Uses the short hand form for defining a single expression function
     */
    override fun toString(): String = "Person [$age, $name]"

}