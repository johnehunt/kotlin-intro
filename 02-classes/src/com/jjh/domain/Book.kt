package com.jjh.domain

class Book(val title: String, val author: String, var price: Double) {
    fun calculateDiscount(discount: Double): Double {
        var price = 0.0
        val discountAmount = this.price * discount
        price = this.price - discountAmount
        return price
    }

    fun printMe(): Unit = println("Book($title, $author, $price)")

    fun updatePrice(price: Double) {
        if (price > 0.0) {
            this.price = price
        }
    }

}

fun main(args: Array<String>) {
    val book = Book("Kotlin", "John Smith", 15.99)
    println("Discount price is ${book.calculateDiscount(0.10)}")
    book.printMe()
    book.updatePrice(5.0)
    book.printMe()
}