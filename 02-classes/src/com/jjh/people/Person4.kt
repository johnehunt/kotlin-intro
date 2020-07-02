package com.jjh.people

import com.jjh.people.Person

class Person4(val name: String, var age: Int) {
    var partner: Person? = null;

    constructor(name: String, age: Int, partner: Person) : this(name, age) {
        this.partner = partner
    }

    fun birthday() {
        val oldAge = age
        age++
        println("Happy Birthday $name, you were $oldAge you are now $age")
    }

}