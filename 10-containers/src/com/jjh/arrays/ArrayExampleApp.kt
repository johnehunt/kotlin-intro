package com.jjh.arrays

object ArrayExampleApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val anything: Array<Any> = emptyArray()
        val names: Array<String> = emptyArray()

        val intArray1 = IntArray(5)
        val intArray2 = intArrayOf(2, 4, 6, 8)

        intArray1[0] = 26
        intArray1[1] = 15
        intArray1[2] = 56
        intArray1[3] = 72
        intArray1[4] = 34

        // Iterate over values in array
        for (item in intArray1) {
            println(item)
        }

        // If you need the indices
        for (index in intArray1.indices) {
            println("index: $index - value ${intArray1[index]}")
        }

    }
}