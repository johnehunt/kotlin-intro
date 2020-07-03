package com.jjh.utils

import com.jjh.utils.MathUtils

object MathUtilsApp {

    @JvmStatic
    fun main(args: Array<String>) {
        println(MathUtils.ZERO)
        println(MathUtils.MIN)
        println(MathUtils.MAX)

        MathUtils.add(2, 3)
        MathUtils.sub(6, 2)
    }

}