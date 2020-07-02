package com.jjh.abs

class Car : Conveyance() {
    override fun consumeFuel() {
        fuel = fuel - 0.5
        println("consuming, ")
    }
}