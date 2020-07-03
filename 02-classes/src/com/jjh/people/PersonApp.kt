package com.jjh.people

object PersonApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val p = Person("John", 54)
        println(p)
        println(p.name + " is " + p.age)
        p.age = 55
        // p.name = "Bob" // Compilation error as name is a read only val
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