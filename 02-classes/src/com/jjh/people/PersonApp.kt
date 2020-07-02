package com.jjh.people

import com.jjh.people.Person

object PersonApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val p = Person("John", 54)
        println(p)
        println(p.name + " is " + p.age)
        p.age = 55
        println(p.name + " is " + p.age)
        println(p)
        val p1 = Person("John", 55)
        val p2 = Person("Denise", 52)
        val p3 = Person("Phoebe", 22)
        val p4 = Person("Adam", 20)
        println(p1)
        println(p2)
        println(p3)
        println(p4)
    }
}