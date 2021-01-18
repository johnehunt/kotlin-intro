package com.jjh.exp.func

fun main() {
    runCatching {
        "32a".toInt()
    }.onFailure {
        when (it) {
            is NumberFormatException -> {
                print("Oops - number wasn't formatted correctly: ")
                println(it.message)
            }
            is Exception -> {
                println("some other exception")
                it.printStackTrace()
            }
            else -> throw it
        }
    }.onSuccess {
        println("All went well")
        println(it)
    }

    // If just want to use a vaklue
    val result1 = runCatching {
        "32a".toInt()
    }.getOrElse { 0 }
    println("result1 $result1")

    val result2 = runCatching {
        "32a".toInt()
    }.getOrNull()
    println("result2 $result2")

    runCatching { "32a".toInt() }
        .recover { -1 }
        .map { println(it) }

}