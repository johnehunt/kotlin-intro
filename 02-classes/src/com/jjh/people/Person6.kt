package com.jjh.people

class Person6 constructor(val name: String, // readonly property
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
        return if (spacePosition > 0) {
            name.substring(0, spacePosition)
        } else {
            name
        }
    }

    /**
     * Illustrates converting an instance to a string
     */
    override fun toString(): String {
        return String.format("Person [age=%s, name=%s]", age, name)
    }

}