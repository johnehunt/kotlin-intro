package com.jjh.props

object NullableExampleApp {

    @JvmStatic
    fun main(args: Array<String>) {
        var s: String? = "Hello"
        // s is a nullable var so can assign a string or null
        println(s?.length) // outputs 5
        // If assign null then ?. wil only be run if not null
        // otherwise returns null
        s = null
        println(s?.length) // outputs null
    }
}