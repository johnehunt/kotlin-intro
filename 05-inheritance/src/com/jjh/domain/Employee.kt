package com.jjh.domain

/**
 * Note name and age are constructor params used to pass data to
 * Parent class constructor.
 */
open class Employee(name: String, age: Int, val id: Int) : Person(name, age) {

    var empNumber = 0  // Provides an employee number property
    var hourlyRate = 24.00

    open fun calculatePay(hours: Int): Double = hourlyRate * hours

    override fun sayHello() {
        println("Welcome")
        super.sayHello()
        println("Hi")
    }

}