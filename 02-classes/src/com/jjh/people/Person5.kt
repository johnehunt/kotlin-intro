package com.jjh.people

class Person5(val name: String, var age: Int)  {

    init {
        increment()
    }

    companion object {
        var count: Int = 0
        fun increment() {
            count++
        }
        fun printInstanceCount() {
            println("$count instances have been created")
        }
    }

}