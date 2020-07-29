package com.jjh.people

class Person5(val name: String, var age: Int)  {

    // Provides a default way to convert instance to a string
    override fun toString()= "Person5(name='$name', age=$age)"

}