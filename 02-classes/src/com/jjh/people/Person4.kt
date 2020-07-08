package com.jjh.people

import com.jjh.people.Person

/**
 * Person4 defines a primary constructor and a secondary constructor
 */
class Person4(val name: String, var age: Int = 0) {

    /**
     * Partner is a public read-write property which is nullable
     */
    var partner: Person4? = null;

    init {
        println("In Init")
    }

    /**
     * This is a secondary constructor - it calls the primary constructor
     * and the init block before it performs its own initialization
     */
    constructor(name: String, age: Int, partner: Person4) : this(name, age) {
        println("In secondary constructor")
        this.partner = partner
    }

    fun birthday() {
        val oldAge = age
        age++
        println("Happy Birthday $name, you were $oldAge you are now $age")
    }

}