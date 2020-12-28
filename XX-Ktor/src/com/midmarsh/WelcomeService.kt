package com.midmarsh

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.jackson.*

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import com.fasterxml.jackson.databind.*
import io.ktor.jackson.*
import io.ktor.features.*
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.coroutines.*

fun main() {
    embeddedServer(Netty, 8080) {

        // Set up conversion of instances to JSON
        install(ContentNegotiation) {
            jackson {
                enable(SerializationFeature.INDENT_OUTPUT)
            }
        }

        // Set up routing
        install(Routing) {
            get("/welcome") {
                call.respond("""{"message" : "Welcome"}""")
            }

            get("/hello") {
                call.respond(mapOf("hello" to "world"))
            }
        }

        // Get started
        println("RESTFul Service Started")
        println("For GET Requests see")
        println("\t http://0.0.0.0:8080/welcome")
        println("\t http://0.0.0.0:8080/hello")

    }.start(wait = true)


}