package com.jjh.inner

object AnonymousClassApp {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Starting...")
        execute(Runnable { println("Running") })
        println("Done")
    }

    private fun execute(r: Runnable) {
        r.run()
    }
}