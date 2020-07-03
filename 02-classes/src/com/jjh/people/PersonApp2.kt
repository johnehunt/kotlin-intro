package com.jjh.people

object PersonApp2 {
    @JvmStatic
    fun main(args: Array<String>) {

        // Can use named parameters
        val p1 = Person(name = "John", age = 54)
        val p2 = Person("Adam", age = 21)

        println("----------")

        val p3 = Person2("123", "Phoebe", 23)
        println(p3)
        println("${p3.name} is ${p3.age}")

        val p4 = Person2("123", "Phoebe")
        val p5 = Person2("123", age = 23)
        val p6 = Person2("123")
    }
}