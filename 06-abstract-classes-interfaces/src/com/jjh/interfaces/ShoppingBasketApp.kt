package com.jjh.interfaces

// Can import Printer.printMe if required
// import com.jjh.interfaces.domain.Printer.Companion.printMe

fun main() {
    // Can call method on interface
    Printer.printMe()
    // Compile error
    // ShoppingBasket.printMe()
    // Compile error
    val basket = ShoppingBasket()
    // basket.printMe()
}
