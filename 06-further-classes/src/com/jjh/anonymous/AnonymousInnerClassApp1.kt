package com.jjh.anonymous

object AnonymousInnerClassApp1 {

    @JvmStatic
    fun main(args: Array<String>) {
        val r1: Runnable = object : Runnable {
            override fun run() {
                println("Running")
            }
        }
        // Using an annonymous inner class
        execute(r1)
        println("Done")
    }

    private fun execute(r: Runnable) {
        r.run()
    }

}