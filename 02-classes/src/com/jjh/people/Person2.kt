package com.jjh.people

/**
 * Class Person2
 * has a private read-only property key (only accessible within class)
 * a public readonly property name with a defualt value of ""
 * a public read-write property age with a defualt value of 0
 *
 * Can instantiate class using
 * Person2("VC123")
 * Person2("VC123", "John")
 * Person2("VC123", "John", 21)
 */
class Person2 (private val key: String, val name: String = "", val age: Int = 0)