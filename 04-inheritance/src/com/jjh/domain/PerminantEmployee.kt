package com.jjh.domain

import com.jjh.domain.Employee

open class PerminantEmployee(name: String, age: Int, id: Int) : Employee(name, age, id) {
    private val numberOfDaysOff = 22
}