package com.jjh.maps

object MapExampleApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val map1: Map<Int, String> = mapOf(
                1 to "John",
                2 to "Denise")

        val map2 = mapOf(
                1 to "John",
                2 to "Denise")

        val map = mutableMapOf(
                "Ireland" to "Dublin",
                "UK" to "London",
                "France" to "Paris",
                "Spain" to "Madrid"
        )

        println(map1)
        println(map2)
        println(map)

        println(map.size)
        println(map.keys)
        println(map.values)
        println(map.isEmpty())
        println(map.get("UK")) // Return value for key or Null
        println(map["UK"]) // Returns value for key or null
        println(map.get("USA"))
        println(map["USA"])
        println(map.contains("UK"))
        println(map.getOrDefault("Germany", "Not known"))

        map.put("Germany", "Berlin")
        println(map)

        for (key in map.keys) {
            println("key: $key - value: ${map.get(key)}")
        }


    }
}