package com.jjh.domain

import com.jjh.domain.Employee

object SampleApp4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val e = Employee("John", 55, 1234)
        e.sayHello()
    }
}