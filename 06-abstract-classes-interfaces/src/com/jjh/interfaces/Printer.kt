package com.jjh.interfaces

interface Printer {
    fun prettyPrint()

    companion object {
        @JvmStatic
		fun printMe() {
            println("Printer - printMe")
        }
    }
}