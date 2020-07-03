package com.jjh.domain

class Book(val title: String, val author: String, var price: Double) {
    fun calculateDiscount(discount: Double): Double {
        var price = 0.0
        val discountAmount = this.price * discount
        price = this.price -discountAmount
        return price
    }
}