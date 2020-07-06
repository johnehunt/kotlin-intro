package com.jjh.lists

object ListExampleApp {
    @JvmStatic
    fun main(args: Array<String>) {

        // List creation options
        val myList0: List<String> = ArrayList()
        val myList1: MutableList<String> = ArrayList()

        val myList2 = listOf<String>("One", "Two", "Three")
        val myList3 = listOf("One", "Two", "Three")

        println(myList2)
        println(myList2.size)
        println(myList2.lastIndex)
        println(myList2.isEmpty())
        println(myList2.isNotEmpty())
        println(myList2.asReversed())

        myList1.add("John")
        println(myList1)
        myList1.addAll(listOf("Denise", "Phoebe"))
        println(myList1)

        // Accessing an element
        println(myList1.get(2))
        println(myList1[2])

        // Updating an element
        myList1.set(2, "Jasmine")
        println(myList1)
        myList1[2] = "Adam"
        println(myList1)

        // Checking that an element is in a list
        println(myList1.contains("Adam"))
        println(myList1.indexOf("Adam"))

        // Looping through a list
        // Iterate over values in array
        for (item in myList1) {
            println(item)
        }

        // If you need the indices
        for (index in myList1.indices) {
            println("index: $index - value ${myList1[index]}")
        }

    }
}