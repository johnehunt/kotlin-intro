package com.jjh.tailrecursion

fun factorial(n: Int): Int {
    return if (n == 1)
        1 // Base case
    else
        n * factorial(n - 1) // Recursive call
}

tailrec fun factorialTailRec(acc: Int = 1, n: Int): Int {
    // Termination condition
    return if (n == 1)
        acc // Base case
    else
        factorialTailRec(acc * n, n - 1) // Tail Recursive call
}

// Method isn't tail recursive
fun bang(x: Int): Int {
    return if (x == 0) throw RuntimeException("Bang!")
    else bang(x - 1) + 1
}

tailrec fun bangTailRec(x: Int): Int {
    return if (x == 0)
        throw Exception("Bang!")
    else
        bangTailRec(x - 1)
}

class Processor {
     tailrec fun bangTailRecMethod(x: Int): Int {
        return if (x == 0)
            throw Exception("Bang!")
        else
            bangTailRecMethod(x - 1)
    }
}

fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTailRec(n = 5))
    // println(bang(4))
    // println(bangTailRec(4))
    val processor = Processor()
    processor.bangTailRecMethod(4)
}

