package com.jjh.inner

class Util {

    // Top level nested class defined within the scope of Util namesapce
    class Printer {
        fun print(msg: String) {
            println(this.javaClass.name + " - " + msg)
        }
    }

    // Top level interface defined wihtin the scope of the Util namespace
    interface Printable {
        fun convert(): String?
    }

    // Abstract top level class defined wihtin the scope of the Util namespace
    abstract class DefaultPrintable : Printable {
        abstract val name: String?
    }
}