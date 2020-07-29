package com.jjh.data

fun main(args: Array<String>) {
    val obj1 = GameObject(10.0, 10.0)
    println(obj1)
    val obj2 = GameObject(10.0, 10.0)
    println(obj1 == obj2)
    println(obj1.hashCode())

    println("-------")

    val ship = Ship(10.0, 10.0)
    println(ship)
    println(ship.image)

    println("------")
    // copying

    val otherShip = ship.copy(x = 20.0)
    println(otherShip)

    // Data classes can be destructured
    val (x, y) = otherShip
    println("x $x, y $y")

    val (a, b) = ship
    println("a $a, b $b")
}
