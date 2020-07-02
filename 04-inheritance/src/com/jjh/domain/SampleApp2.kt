package com.jjh.domain

import com.jjh.domain.Employee
import com.jjh.domain.Sales

object SampleApp2 {
    @JvmStatic
    fun main(args: Array<String>) {
        var e: Employee = Employee("John", 55, 1234)
        var s: Sales = Sales("Adam", 20, 3456)
        e = s
        println(e)
        s = e
        println(s)
    }
}