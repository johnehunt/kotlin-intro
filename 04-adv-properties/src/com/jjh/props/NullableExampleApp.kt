package com.jjh.props

fun main() {
    println(GameUtil.currentPlayer?.toString())
    GameUtil.currentPlayer = GamePlayer("John", "Hunt", 21, "ABC123")
    println(GameUtil.currentPlayer?.toString())
}