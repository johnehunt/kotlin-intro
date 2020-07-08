package com.jjh.domain

class Contractor(name: String, age: Int, id: Int) : TemporaryEmployee(name, age, id) {

    init {
        hourlyRate = 37.00 // Property defined in Employee
    }

}