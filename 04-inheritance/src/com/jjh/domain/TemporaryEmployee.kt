package com.jjh.domain

import com.jjh.domain.Employee

open class TemporaryEmployee(n: String, a: Int, id: Int) : Employee(n, a, id) {
    var startDate = ""
    var periodOfContract = 6
}