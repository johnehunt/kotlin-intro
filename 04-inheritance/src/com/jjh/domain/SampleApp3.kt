package com.jjh.domain

import com.jjh.domain.Developer
import com.jjh.domain.Employee
import com.jjh.domain.Sales

object SampleApp3 {
    @JvmStatic
    fun main(args: Array<String>) {
        var e: Employee = Employee("John", 55, 1234)
        var d: Developer = Developer("Eloise", 25, 5432)
        val s = Sales("Adam", 20, 3456)
        e = d
        e = s

//        d = s
//        s = d

        d = e as Developer
    }
}