package com.jjh.anonymous

object Executor {
    fun execute(r: Runnable) {
        r.run()
    }
}

fun main() {
        // Creating an anonymous inner class from
        // an interface - object indicates there is a single
        // instance created and held in runnable
        val runnable: Runnable = object : Runnable {
            override fun run() {
                println("Running")
            }
        }
        // Using an anonymous inner class
        Executor.execute(runnable)
        println("Done")
}