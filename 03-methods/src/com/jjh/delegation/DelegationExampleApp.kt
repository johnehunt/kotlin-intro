package com.jjh.delegation

interface Role {
    fun printRole(): Unit
}

class TellerRole(val name: String) : Role {
    override fun printRole() = println("Role: $name")
}

// Implements the delegation design pattern
// All implements of the Role interface methods are automatically
// delegated to TellerRole
class User(name: String) : Role by TellerRole(name) {
}

object DelegationExampleApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val user = User("Player1")
        user.printRole()
    }
}