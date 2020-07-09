package com.jjh.props

fun main(args: Array<String>) {
    val player = GamePlayer("John", "Hunt", 36, "123AA")
    // age is a read-write property initialise din constructor
    println(player.age)
    player.age = player.age + 1
    println(player.age)
    // id is a read only property initialise din the constructor
    println(player.id)
    // fullname is a readonly property
    println(player.fullname)
    // Favourite Game is a read-write property
    player.favouriteGame = "Assasins Creed"
    println(player.favouriteGame)

    player.birthday()

}