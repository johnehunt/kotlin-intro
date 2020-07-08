package com.jjh.domain

object BookApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val book = Book("Kotlin", "John Smith", 15.99)
        println("Discount price is ${book.calculateDiscount(0.10)}")
    }
}