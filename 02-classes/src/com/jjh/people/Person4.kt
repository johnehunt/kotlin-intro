package com.jjh.people

import com.jjh.people.Person

class Person4(val name: String, var age: Int = 0) {
    var partner: Person4? = null;

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