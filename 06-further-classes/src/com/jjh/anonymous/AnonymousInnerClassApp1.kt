package com.jjh.anonymous

object AnonymousInnerClassApp1 {

    @JvmStatic
    fun main(args: Array<String>) {
        // Creating an anonymous inner class from
        // an interface - object indicates there is a single
        // instance created and held in runnable
        val runnable: Runnable = object : Runnable {
            override fun run() {
                println("Running")
            }
        }
        // Using an anonymous inner class
        execute(runnable)
        println("Done")
    }

    private fun execute(r: Runnable) {
        r.run()
    }

}