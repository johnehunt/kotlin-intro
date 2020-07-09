package com.jjh.inner

fun main(args: Array<String>) {
    val agent = Agent("John", "10 High Street")
    agent.printSelf()
    println("============")
    agent.address.printSelf()
}