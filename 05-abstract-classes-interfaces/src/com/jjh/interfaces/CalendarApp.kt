package com.jjh.interfaces

object CalendarApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val cal = Calendar()
        cal.add("Dentist", "Monday")
        val org: Organizer = cal
        org.add("Garage", "Tuesday")
    }
}