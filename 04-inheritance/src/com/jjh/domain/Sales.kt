package com.jjh.domain

import com.jjh.domain.PerminantEmployee

final class Sales(n: String?, a: Int, id: Int) : PerminantEmployee(n!!, a, id) {
    private val bonus = 200.0
    final override fun calculatePay(hours: Int): Double {
        return super.calculatePay(hours) + bonus
    }
}