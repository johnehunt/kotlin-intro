package com.jjh.inner

class Util {
    class Printer {
        fun print(msg: String) {
            println(this.javaClass.name + " - " + msg)
        }
    }

    interface Printable {
        fun convert(): String?
    }

    abstract class DefaultPrintable : Printable {
        abstract val name: String?
    }
}