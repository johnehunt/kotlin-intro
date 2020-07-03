package com.jjh.anonymous

object AnonymousInnerClassApp2 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Starting...")
        // Using an annonymous lambda
        execute(Runnable { println("Running") })
        println("Done")
    }

    private fun execute(r: Runnable) {
        r.run()
    }
}