package com.jjh.abs

abstract class CommercialVehicle {
    // Abstract property
    abstract val owner: String
    // abstract member function
    abstract fun load(contents: String)
}

class Lorry(override val owner: String) : CommercialVehicle() {
    override fun load(contents: String) {
        println("loading $contents")
    }
}