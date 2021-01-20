package com.jjh.inner

class Calculator(private val value: Int) {
    var result = 0
        private set

    inner class Worker {
        fun performCalculation() {
            for (i in 0 until value) {
                result += i
            }
        }
    }

    val worker: Worker
        get() = Worker()

}

fun main(args: Array<String>) {
    val calc = Calculator(5)
    val worker = calc.worker
    worker.performCalculation()
    println("calc.result: " + calc.result)
}