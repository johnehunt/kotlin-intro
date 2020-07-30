package com.jjh.exp.config

class ConfigFileException(val code: Int, cause: String = "", exp: Exception? = null) : Exception(cause, exp)