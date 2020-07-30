package com.jjh.anonymous


fun main() {
    // Creating an anonymous inner class by extending a class
    // in this case its an abstract class but it doesn't need to be
    val ship: GameObject = object : GameObject() {
        override fun move(x: Int, y: Int): Boolean {
            println("move($x, $y)")
            return true
        }
    }
    ship.move(4, 5)

}

