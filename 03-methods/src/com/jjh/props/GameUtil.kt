package com.jjh.props

object GameUtil {
    val numberOfRounds: Int = 5
    val numberOfLives = 5
    var currentRound = 0

    // Defines a nullable property
    var currentPlayer: GamePlayer? = null

    // Can nullify any type - can now assign
    // an int or null to count
    // GameUtil.count = 3
    // GameUtil.count = null
    var count: Int? = null

}