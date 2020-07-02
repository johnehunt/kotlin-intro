package com.jjh.inner

class Agent(private val name: String, addr: String) {

    inner class Address(private val addr: String) {
        fun printSelf() {
            println("Address self: $this")
            println("Agent self: " + this@Agent)
        }

    }

    val address: Address

    fun printSelf() {
        println("Agent self: $this")
    }

    init {
        address = Address(addr)
    }
}