package com.jjh.data

object GameDataObjectApp {
    @JvmStatic
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
    }
}