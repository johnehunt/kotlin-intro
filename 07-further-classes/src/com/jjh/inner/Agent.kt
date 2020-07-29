package com.jjh.inner

class Agent(private val name: String, addr: String) {

    // Inner class defined within the scope of Agent
    inner class Address(private val addr: String) {
        fun printSelf() {
            println("Address addr: $addr")
            // an 'inner' class can access outer classes properties
            println("Address self: $name")
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