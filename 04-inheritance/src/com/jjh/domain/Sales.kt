package com.jjh.domain

class Sales(n: String?, a: Int, id: Int) : PerminantEmployee(n!!, a, id) {

    private val bonus = 200.0

    override fun calculatePay(hours: Int): Double {
        return super.calculatePay(hours) + bonus
    }
}