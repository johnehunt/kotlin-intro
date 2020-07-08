package com.jjh.people

class Person3(val name: String = "", var age: Int = 0) {

    /**
     * Defines initialization behaviour that is run just
     * after the class is instantiated.
     * Has access to all constructor parameters whether they
     * are properties or not
     */
    init {
        println("In Init")
    }

    /**
     * A member function birthday. Takes no parameters and returns no
     * parameters.
     */
    fun birthday() {
        val oldAge = age
        age++
        println("Happy Birthday $name, you were $oldAge you are now $age")
    }

}