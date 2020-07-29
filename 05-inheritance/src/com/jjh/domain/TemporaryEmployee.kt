package com.jjh.domain

open class TemporaryEmployee(n: String, a: Int, id: Int) : Employee(n, a, id) {
    var startDate = ""
    var periodOfContract = 6
}