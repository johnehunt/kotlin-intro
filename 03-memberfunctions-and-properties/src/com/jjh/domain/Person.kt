package com.jjh.domain

class Person constructor(val name: String, // readonly property
                         var age: Int // read-write property
                         ) {

    fun birthday() {
        val oldAge = age
        age++
        println("Happy Birthday $name, you were $oldAge you are now $age")
    }

    fun printDetails() {
        println("Person - $name, $age")
    }

    fun printWelcomeMessage(msg: String) {
        println("$msg - $name, $age")
    }

    fun printWelcomeMessageWithDefault(msg: String = "Bonjour") {
        println("$msg - $name, $age")
    }

    fun printNullableMessage(message: String?) {
        println(message)
    }

    fun printQualifications(vararg qualifications: String) {
        println(qualifications)
    }

    fun getFirstname(): String {
        var result = ""
        val spacePosition = name.indexOf(" ")
        if (spacePosition > 0) {
            result = name.substring(0, spacePosition)
        } else {
            result = name
        }
        return result
    }

    /**
     * Illustrates converting an instance to a string
     */
    override fun toString(): String {
        return String.format("Person [age=%s, name=%s]", age, name)
    }

}