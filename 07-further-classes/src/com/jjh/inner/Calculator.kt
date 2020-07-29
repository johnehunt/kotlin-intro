package com.jjh.inner

class Calculator(private val value: Int) {
    var result = 0
        private set

    inner class Worker {
        fun calc() {
            for (i in 0 until value) {
                result += i
            }
        }
    }

    val worker: Worker
        get() = Worker()

}