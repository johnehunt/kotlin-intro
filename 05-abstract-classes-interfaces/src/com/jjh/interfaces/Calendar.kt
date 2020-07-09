package com.jjh.interfaces

class Calendar : Organizer {
    override fun add(appointment: String?, date: String?) {
        println("$appointment - $date")
    }

    override operator fun get(date: String?): String? {
        return null
    }

    override fun remove(date: String?): Boolean {
        return false
    }
}

fun main(args: Array<String>) {
    val cal = Calendar()
    cal.add("Dentist", "Monday")
    val org: Organizer = cal
    org.add("Garage", "Tuesday")
}