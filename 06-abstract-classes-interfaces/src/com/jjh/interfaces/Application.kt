package com.jjh.interfaces

class Application : Cloneable, Organizer, Printer, Speaker {
    override fun saySomething() {}
    override fun prettyPrint() {}
    override fun add(appointment: String?, date: String?) {}
    override operator fun get(date: String?): String? {
        return null
    }

    override fun remove(date: String?): Boolean {
        return false
    }
}