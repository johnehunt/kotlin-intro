package com.jjh.domain

open class Employee(name: String, age: Int, val id: Int) : Person(name, age) {
    var empNumber = 0  // Provides an employee number property
    var hourlyRate = 24.00

    open fun calculatePay(hours: Int): Double {
        return hourlyRate * hours
    }

    override fun sayHello() {
        println("Welcome")
        super.sayHello()
        println("Hi")
    }

}