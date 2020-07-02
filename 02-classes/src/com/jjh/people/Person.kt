package com.jjh.people

class Person constructor(val name: String, // readonly property
                         var age: Int // read-write property
                         ) {

    override fun toString(): String {
        return String.format("Person [age=%s, name=%s]", age, name)
    }

}