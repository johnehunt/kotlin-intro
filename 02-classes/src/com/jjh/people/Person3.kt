package com.jjh.people

class Person3(val name: String, var age: Int) {

    init {
        println("In Init")
    }

    fun birthday() {
        val oldAge = age
        age++
        println("Happy Birthday $name, you were $oldAge you are now $age")
    }

}