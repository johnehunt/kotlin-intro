package com.jjh.container

data class Trade(val id: Int, val equity: String, val amount: Int)

fun main() {
    val myList = listOf("Zero", "One", "Two")

    // Loop through each element in the list
    myList.forEach { s -> println(s) }
    myList.forEach { println(it) }
    myList.forEachIndexed { i, s -> println("index: $i value: $s") }

    println("------")

    // Applying Map and Filter
    val numbers = listOf(1, 2, 3, 4)
    println(numbers)
    val numbers2 = numbers.map { i -> i + 1 }
    println(numbers2)
    val numbers3 = numbers.filter { i -> i > 2 }
    println(numbers3)

    // Can combine two HoF together
    numbers.filter { i -> i > 2 }.forEach { println(it) }

    println("------")

    println(myList)
    println(myList.sorted())
    println(myList.sortedBy { s -> s.length })

    println("------")

    // Folding
    val result = numbers.fold(0) { acc, i -> i + acc }
    println(result)
    val result2 = numbers.foldRight(0) { acc, i -> i + acc }
    println(result2)

    // Using Reduce
    val result3 = numbers.reduce { acc, i -> i + acc }
    println(result3)

    println("------")

    // Grouping
    val trades = listOf(
            Trade(1, "IBM", 10),
            Trade(2, "MSoft", 5),
            Trade(3, "IBM", 15),
            Trade(4, "Oracle", 11),
            Trade(5, "MSoft", 7)
    )

    val groupByEquity = trades.groupBy { t -> t.equity }

    println(groupByEquity)
    println(groupByEquity["IBM"])

    println("------")
    // zipping

    val l1 = listOf("One", "Two", "Three", "Four")
    val l2 = listOf("Alpha", "Beta", "Gamma")

    val seq = l1 zip l2
    println("seq: $seq")

    println("------")

    // Flattern and FlatMap

    val ll = listOf(listOf(1, 2), listOf(4, 5))
    println(ll)
    println(ll.flatten())

    println(ll.flatMap { it.filter { i -> i > 1 } })

}