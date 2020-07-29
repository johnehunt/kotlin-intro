package com.jjh.inlinecls

/**
 * An inline class must have a single property initialized in the primary constructor.
 * At runtime, instances of the inline class will be represented using this single property.
 *
 * inline classes cannot have init blocks
 * inline class properties cannot have backing fields
 * inline classes can only have simple computable properties (no lateinit/delegated properties)
 *
 * Inline classes are available only since Kotlin 1.3 and currently are experimental.
 */
inline class Name(val s: String) {
    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}

fun main() {
    val name = Name("Kotlin")
    name.greet() // method `greet` is called as a static method
    println(name.length) // property getter is called as a static method
}