package com.jjh.arrays

data class Person(val name: String)

fun main() {
    // Create some empty arrays
    val anything: Array<Any> = emptyArray()
    val names: Array<String> = emptyArray()
    val data = arrayOf<String>()

    println("anything: $anything")
    println("names: $names")
    println("data: $data")
    println("anything.size: ${anything.size}")

    // Create an array that can hold strings
    val stringData = arrayOfNulls<String>(5)
    println("stringData.size: ${stringData.size}")

    // Create an array of Integers
    val intArray1 = IntArray(5)  // Array<Int>
    val intArray2 = intArrayOf(2, 4, 6, 8)
    val data2 = arrayOf<String>("John", "Denise") // String can be inferred

    println("intArray2: $intArray2")
    println("intArray2.size: ${intArray2.size}")

    intArray1[0] = 26
    intArray1[1] = 15
    intArray1[2] = 56
    intArray1[3] = 72
    intArray1[4] = 34

    println("intArray1[0]: ${intArray1[0]}")

    // Iterate over values in array
    for (item in intArray1) {
        println("item: $item")
    }

    // for (index in 0 until intArray1.size())
    // If you need the indices
    for (index in intArray1.indices) {
        println("index: $index - value ${intArray1[index]}")
    }

    // Can also have arrays of custom objects
    // Type of array inferred from arrayOf list -
    // ie an array of Persons - Array<Person>
    val personArray = arrayOf(Person("John"),
                              Person("Denise"),
                              Person("Adam"),
                              Person("Phoebe"))
    println("personArray: $personArray")
    for (person in personArray) {
        println("person: $person")
    }

    // Array of variety of things
    val things = arrayOf("John", 2, true)
    for (item in things) {
        println(item)
    }

}
