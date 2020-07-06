package com.jjh.queue

import kotlin.collections.*

object QueueExampleApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val nums: ArrayDeque<Int> = ArrayDeque<Int>(listOf(1, 2, 3))
        println(nums)
        val names: ArrayDeque<String> = ArrayDeque<String>(5)
        names.add("John")
        names.add("Denise")
        names.add("Adam")

        println(names)
        println(names.size)
        println(names.first())
        println(names.last())

        println(names.removeFirst())
        println(names)

    }
}