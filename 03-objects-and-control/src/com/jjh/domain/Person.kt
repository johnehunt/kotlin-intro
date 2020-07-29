package com.jjh.domain

class Person(val name: String, var age: Int)  {

    init { increment() }

    companion object {
        var count: Int = 0
        fun increment() = count++
        fun printInstanceCount() = println("$count instances created")
    }

    // Provides a default way to convert instance to a string
    override fun toString()= "Person5(name='$name', age=$age)"

}

fun main() {
    val p1 = Person("John", 55)
    val p2 = Person("Denise", 53)
    val p3 = Person("Phoebe", 23)
    Person.printInstanceCount()
}