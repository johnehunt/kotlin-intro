package com.jjh.enums

object CompassDirectionsApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val directions = CompassDirections.values()
        println(directions.size)
        val d = CompassDirections.WEST
        when (d) {
            CompassDirections.WEST -> println("Heading " + d.bearing)
            else -> println("Unknown heading")
        }
    }
}