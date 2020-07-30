package com.jjh.arrays

data class Person(val name: String)

fun main(args: Array<String>) {
    // Create some empty arrays
    val anything: Array<Any> = emptyArray()
    val names: Array<String> = emptyArray()

    println("anything: $anything")
    println("names: $names")
    println("anything.size: ${anything.size}")

    // Create an array of Integers
    val intArray1 = IntArray(5)
    val intArray2 = intArrayOf(2, 4, 6, 8)
    println("intArray2: $intArray2")
    println("intArray2.size: ${intArray2.size}")

    intArray1[0] = 26
    intArray1[1] = 15
    intArray1[2] = 56
    intArray1[3] = 72
    intArray1[4] = 34

    // Iterate over values in array
    for (item in intArray1) {
        println("item: $item")
    }

    // If you need the indices
    for (index in intArray1.indices) {
        println("index: $index - value ${intArray1[index]}")
    }

    // Can also have arrays of custom objects
    // Type of array infered form arrayOf list - ie an array of Persons
    val personArray = arrayOf(Person("John"), Person("Denise"), Person("Adam"), Person("Phoebe"))
    println("personArray: $personArray")
    for (person in personArray) {
        println("person: $person")
    }

}
