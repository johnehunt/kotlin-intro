package com.jjh.domain

object PersonApp {

    @JvmStatic
    fun main(args: Array<String>) {
        val p1 = Person("John Hunt", 55)
        println(p1)
        p1.birthday()
        p1.printDetails()
        p1.printWelcomeMessage("Hello")
        p1.printWelcomeMessage(msg = "Welcome")
        p1.printWelcomeMessageWithDefault()
        p1.printWelcomeMessageWithDefault("Hi There")
        p1.printWelcomeMessageWithDefault(msg= "Good day")
        p1.printNullableMessage(null)
        p1.printNullableMessage("Yo!")

        p1.printQualifications("BSc")
        p1.printQualifications("BSc", "MSc")
        p1.printQualifications("BSc", "MSc", "PhD")

        println(p1.getFirstname())

    }
}