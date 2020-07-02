package com.jjh.inner

object CalculatorApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val calc = Calculator(5)
        val worker = calc.worker
        worker.calc()
        println("calc.getResult(): " + calc.result)
    }
}