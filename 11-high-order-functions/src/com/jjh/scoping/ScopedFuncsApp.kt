package com.jjh.scoping

class User(val name: String) {
    var id: String = ""
    var game: String = ""

    override fun toString(): String {
        return "User(name='$name', id='$id', game='$game')"
    }
}

class Service(val url: String) {
    var port = 80
    fun query(method: String): Boolean {
        println("$method on $url:$port")
        return true
    }
}

fun main() {
    // Use apply for code blocks that don't return a value and configure
    // the instance.
    val user = User("John").apply {
        this.id = "123"
        game = "Nightfall"
    }
    println("${user.id} ${user.name}")

    // Use let to execute 1 or more operations on an object
    // let lambda returns a result
    val s = "Hello World"
    val s2 = s.let { s -> s.toUpperCase() }
    val s3 = s.let {
        println(it)
        it.toUpperCase()
    }

    // with - allows sequence of operations to be written all
    // relating to the object passed to it. Avoid repeatedly referencing object
    val label = with(user) {
        id = "new$id"
        game = "new$game"
        println(this)
        this.toString()
    }
    println("label: $label")

    // Also similar to with but the object is not automatically bound
    // to 'this' instead 'it' makes it available as a parameter
    user.also { obj -> println(obj) }
    user.also { println(it) }

    // run useful when your lambda contains both the
    // object initialization and the computation of the
    // return value.
    val service = Service("http://www.midmarsh.com")
    val result = service.run {
        port = 8080
        query("get")
    }
    println("result: $result")

    // Conditional Execution
    service.takeIf { service.port > 1024 }?.run {
        println(query("get"))
    }

    service.takeUnless{service.port > 1024 }?.run {
        println(query("get"))
    }

}