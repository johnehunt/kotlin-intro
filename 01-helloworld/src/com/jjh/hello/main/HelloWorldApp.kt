package com.jjh.hello.main

object HelloWorldApp {

    /**
     * Defines entry point for a Kotlin application.
     * Need to indicates that the compiler should generate
     * byte codes that are compatible with the Java definition
     * of a static method that it expects to find to run a program
     */
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello World!")
        println(KotlinVersion.CURRENT) // Check version of Kotlin being run
    }

}