package com.example

import com.example.plugins.receiveDataOrRequest
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {
        // here install content, ok why?
           // because without وجود "a json || content" can't transformation تحويل from data class to json
        install(plugin = ContentNegotiation) {
            json()
        }
        receiveDataOrRequestFromPostman()

    }.start(wait = true)
}


   // here I receive "data || request" by data class
      // (don't forget choose Body then raw then choose JSON instead of Text)
fun Application.receiveDataOrRequestFromPostman() {
    receiveDataOrRequest()
}

