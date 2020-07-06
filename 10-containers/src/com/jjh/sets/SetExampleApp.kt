package com.jjh.sets

object SetExampleApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val set1: Set<String> = HashSet()
        val set2: MutableSet<String> = HashSet()

        val set3 = setOf<String>("One", "Two", "Three")
        val set4 = setOf("A", "B", "C")
        val set5 = mutableSetOf("Chasing Pavements",
                "Rumour Has it",
                "Turning Tables")

        println(set5)
        println(set5.size)
        println(set5.isEmpty())
        println(set5.isNotEmpty())

        // Checking that an element is in a list
        println(set5.contains("Skyfall"))
        println(set5.indexOf("Skyfall"))

        // Can only add a value once
        set5.add("Skyfall")
        println(set5)
        set5.add("Skyfall")
        println(set5)

        // Looping through a list
        // Iterate over values in array
        for (item in set5) {
            println(item)
        }

    }
}