package com.jjh.domain

class Manager(n: String?, a: Int, id: Int) : PerminantEmployee(n!!, a, id) {
    fun printPay() {
        println(calculatePay(40))
    }
}