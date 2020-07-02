package com.jjh.domain

class Contractor(n: String, a: Int, id: Int) : TemporaryEmployee(n, a, id) {
    init {
        hourlyRate = 37.00 // Property defined in Employee
    }
}