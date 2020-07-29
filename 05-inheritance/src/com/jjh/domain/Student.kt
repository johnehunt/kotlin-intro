package com.jjh.domain

open class Student(val name: String = "John Smith",
                   val degree: String = "B.Sc.",
                   val institution: String = "Oxford") {
    fun printWelcomeMessage(): Unit = println("Hello $name")
    override fun toString(): String = "Student($name, $degree, $institution)"
}

class PostGraduateStudent(val researchTopic: String): Student() {
    fun printDoResearch(): Unit =  println("Doing research in $researchTopic")
}

fun main() {
    val student = PostGraduateStudent("A.I.")
    println(student)
    student.printWelcomeMessage()
    student.printDoResearch()
}