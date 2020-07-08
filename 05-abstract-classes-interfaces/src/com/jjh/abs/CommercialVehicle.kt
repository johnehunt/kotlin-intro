package com.jjh.abs

abstract class CommercialVehicle : Conveyance() {
    abstract fun load(contents: String)
}