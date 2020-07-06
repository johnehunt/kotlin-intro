package com.jjh.data

//open class  GameObject
//
//data class GamePiece(val x: Double, val y: Double): GameObject()

/**
 * Data class gets
 * default toString based on primary constructor properties
 * equals and hashcode methods based on constructor properties
 * plus a copy function
 */
data class GameObject(val x: Double, val y: Double)

data class Ship(val x: Double, val y: Double) {
    // following property is not used by toString, equals, hashcode etc.
    val image: String = "ship.png"
}

