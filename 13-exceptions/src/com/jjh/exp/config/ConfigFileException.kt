package com.jjh.exp.config

class ConfigFileException1(val code: Int,
                           message: String) : Exception(message)

class ConfigFileException(val code: Int,
                          message: String = "",
                          cause: Throwable? = null) : Exception(message, cause)