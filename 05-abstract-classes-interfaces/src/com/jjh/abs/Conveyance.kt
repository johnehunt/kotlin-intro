package com.jjh.abs

abstract class Conveyance {

    protected var fuel = 5.0
    private var running = false

    fun startup() {
        running = true
        consumeFuel()
        while (fuel > 0) {
            consumeFuel()
        }
        running = false
    }

    abstract fun consumeFuel()
}