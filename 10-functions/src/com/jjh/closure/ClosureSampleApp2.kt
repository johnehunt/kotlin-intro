package com.jjh.closure

object ClosureSampleApp2 {

    var increment: (Int) -> Int = { x -> x + 3}

    @JvmStatic
    fun main(args: Array<String>) {
        println(increment(5))
        resetFunc()
        println(increment(5))
    }

    private fun resetFunc() {
        // Local val is bound and stored in function
        // as it is used within the function body
        val addition = 50
        increment = { a ->  a + addition }
    }
}