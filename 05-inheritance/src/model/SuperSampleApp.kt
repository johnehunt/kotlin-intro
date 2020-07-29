package model

open class Base {
    open fun print(): Unit = println("Base")
}

class Derived : Base() {
    override fun print(): Unit {
        println("Derived before")
        super.print()
        println("Derived After")
    }
}

fun main() {
    val derived = Derived()
    derived.print()
}