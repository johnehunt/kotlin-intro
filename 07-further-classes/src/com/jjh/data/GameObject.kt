package com.jjh.data

open class  GameEntity

data class GamePiece(val x: Double, val y: Double): GameEntity()

/**
 * Data class gets
 * - default toString based on primary constructor properties
 * - equals and hashcode methods based on constructor properties
 * - plus a copy function.
 *
 * Data classes can extend other classes but a data class cannot
 * extend a data class (since Kotlin 1.1)
 * But in general avoid inheritance with data classes
 */
data class GameObject(val x: Double, val y: Double) : Cloneable

data class Ship(val x: Double, val y: Double) {
    // following property is not used by toString, equals, hashcode etc.
    val image: String = "ship.png"
}


