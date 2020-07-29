package com.jjh.domain

class Graduate(name: String,
               age: Int,
               val degree: String,
               val uni: String) : Person(name, age)
