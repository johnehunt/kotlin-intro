package com.jjh.domain

open class PerminantEmployee(name: String, age: Int, id: Int) : Employee(name, age, id) {
    val numberOfDaysOff = 22
}