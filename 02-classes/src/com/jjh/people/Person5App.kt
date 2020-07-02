package com.jjh.people

import com.jjh.people.Person5

object Person5App {

    @JvmStatic
    fun main(args: Array<String>) {
        val p1 = Person5("John", 55)
        val p2 = Person5("Denise", 53)
        val p3 = Person5("Phoebe", 23)
        Person5.printInstanceCount()
    }
}