package com.jjh.interfaces

interface Organizer {
    fun add(appointment: String?, date: String?)
    fun get(date: String?): String?
    fun remove(date: String?): Boolean
}