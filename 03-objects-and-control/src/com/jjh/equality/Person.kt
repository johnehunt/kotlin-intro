package com.jjh.equality

class Person(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            null -> false
            is com.jjh.identity.Person ->
                ((other.name == name) && (other.age == age))
            else -> false
        }
    }

    override fun hashCode(): Int = name.hashCode() +  age

}

fun main() {
    val p1 = Person("John", 21)
    val p2 = Person("John", 21)
    println("p1 === p2: ${p1 === p2}") // checks for reference equality
    println("p1 == p2: ${p1 == p2}") // checks for structural equality
    println("p1.equals(p2): ${p1.equals(p2)}") // again structural equality
}