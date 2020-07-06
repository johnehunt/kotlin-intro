package com.jjh.exp.set

class SetException(val code: Int, cause: String = "", exp: Exception? = null) : Exception(cause, exp)