package com.jjh.interfaces

object EmployeeApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val e = Employee()
        e.sayHello()
        e.saySomething()
    }
}