package com.jjh.functions

object SampleFuncApp {
    @JvmStatic
    fun main(args: Array<String>) {

        // Functions not returning a value
        printHello()
        printMessage("Hello World")
        printHello2()
        // Functions returning a value
        val result = double(2)
        println("result: $result")
        println("add(2, 3) ${add(2, 3)}")
        // Default arguments
        println("increment(2) ${increment(2)}")
        println("increment(2, 3) ${increment(2, 3)}")
        // Using named arguments
        println("increment(x = 2) ${increment(x = 2)}")
        println("add(x=2, y=3) ${add(x = 2, y = 3)}")
        println("add(y=3, x=2) ${add(y = 3, x = 2)}")
        // Variable length argument list
        printer("John")
        printer("John", "Denise")
        printer("John", "Denise", "Phoebe")
        printer("John", "Denise", "Phoebe", "Adam")
        // Single-expression functions
        println("tripler(3): ${tripler(3)}")
        println("tripler2(3): ${tripler2(3)}")
        // Calling inline function
        println("calculate(): ${calculate()}")
    }
}