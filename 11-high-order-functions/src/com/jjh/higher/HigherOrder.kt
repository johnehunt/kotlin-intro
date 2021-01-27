package com.jjh.higher

typealias MyIntFunction = (Int) -> Int

fun processor(x: Int, func: MyIntFunction): Int {
    return func(x)
}

fun increment(i: Int) = i + 1

fun main() {

    val amount = 5
    println(processor(amount, ::increment))

    val inc: MyIntFunction = fun(x: Int) = x + 1

    val r1 = processor(amount, fun(x: Int) = x + 1)
    println(r1)

    val r2 = processor(amount, {i -> i + 1})
    println(r2)

    val r3 = processor(amount) {i -> i + 1}
    println(r3)

    val r4 = processor(amount) {it + 1}
    println(r4)

}