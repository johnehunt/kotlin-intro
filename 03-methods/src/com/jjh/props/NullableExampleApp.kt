package com.jjh.props

object NullableExampleApp {

    @JvmStatic
    fun main(args: Array<String>) {
        var s: String? = "Hello"
        println(s?.length)
        s = null
        println(s?.length)
    }
}