package com.jjh.equality

class Person(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Person) return false
        if (other.name != name && other.age != age) return false
        return true
    }

    override fun hashCode(): Int = name.hashCode() +  age

}

fun main() {
    val p1 = Person("John", 21)
    val p2 = Person("John", 21)
    println("p1 == p2: ${p1 == p2}")
    println("p1 != p2: ${p1 != p2}")
}