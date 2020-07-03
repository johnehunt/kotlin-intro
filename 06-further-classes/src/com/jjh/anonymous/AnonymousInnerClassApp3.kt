package com.jjh.anonymous

object AnonymousInnerClassApp3 {

    @JvmStatic
    fun main(args: Array<String>) {
        val ship: GameObject = object : GameObject() {
            override fun move(x: Int, y: Int): Boolean {
                println("move($x, $y)")
                return true
            }
        }

        ship.move(4, 5);

    }

}