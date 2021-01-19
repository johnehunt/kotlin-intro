package com.jjh.data

fun main() {
    val obj1 = GameObject(10.0, 10.0)
    println(obj1)
    val obj2 = GameObject(10.0, 10.0)
    println(obj2)
    println(obj1 == obj2)
    println(obj1.hashCode())

    println("-------")

    val ship = Ship(10.0, 10.0)
    println(ship)
    println(ship.image)

    println("------")
    // copying

    println(ship)
    val otherShip = ship.copy(x = 20.0)
    println("othership: $otherShip")
    println("otherShip.image: ${otherShip.image}")

    println("------")

    // Data classes can be destructured
    val (x, y) = ship
    println("x $x, y $y")

    val (a, b) = otherShip
    println("a $a, b $b")

}
