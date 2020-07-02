package com.jjh.inner

class CalculateFib {
    fun printFibSequence(number: Int) {
        val separator = ","

        class Fib {
            fun printFib(n: Int) {
                var n1 = 0
                var n2 = 1
                var n3 = 0
                for (i in 2 until n) {
                    n3 = n1 + n2
                    print(separator + n3)
                    n1 = n2
                    n2 = n3
                }
            }
        }
        print(0.toString() + separator + 1) // printing 0 and 1

        val fib = Fib()
        fib.printFib(number)
    }
}