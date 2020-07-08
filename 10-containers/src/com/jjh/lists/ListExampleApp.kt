package com.jjh.lists

object ListExampleApp {
    @JvmStatic
    fun main(args: Array<String>) {

        // List creation options
        val myList0: List<String> = ArrayList()
        val myList1: MutableList<String> = ArrayList()

        println("myList0: $myList0")
        println("myList1: $myList1")

        val myList2 = listOf<String>("One", "Two", "Three")
        val myList3 = listOf("One", "Two", "Three")

        println("myList2: $myList2")
        println("myList2.siz: ${myList2.size}")
        println("myList2.first(): ${myList2.first()}")
        println("myList2.last(): ${myList2.last()}")
        println("myList2.takeLast(2): ${myList2.takeLast(2)}")
        println("myList2.lastIndex: ${myList2.lastIndex}")
        println("myList2.isEmpty(): ${myList2.isEmpty()}")
        println("myList2.isNotEmpty(): ${myList2.isNotEmpty()}")
        println("myList2.asReversed(): ${myList2.asReversed()}")

        // Can add to myList1 as its a mutable List
        println("adding to a Mutable List")
        println("myList1:$myList1")
        myList1.add("John")
        println("myList1:$myList1")
        myList1.addAll(listOf("Denise", "Phoebe"))
        println("myList1:$myList1")

        // Accessing an element
        println("Accessing elements by index")
        println("myList1.get(2): ${myList1.get(2)}")
        println("myList1[2]:${myList1[2]}")

        // Updating an element
        println("Updating elements by index")
        println("myList1:$myList1")
        myList1.set(2, "Jasmine")
        println("myList1:$myList1")
        myList1[2] = "Adam"
        println("myList1:$myList1")

        // Checking that an element is in a list
        println("Checking an element is in a list")
        println("myList1.contains(\"Adam\"): ${myList1.contains("Adam")}")
        println("myList1.indexOf(\"Adam\"): ${myList1.indexOf("Adam")}")

        // Looping through a list
        // Iterate over values in array
        println("Iterating over a list")
        for (item in myList1) {
            println(item)
        }

        // If you need the indices
        println("Accessing index and value in a list")
        for (index in myList1.indices) {
            println("index: $index - value ${myList1[index]}")
        }

    }
}