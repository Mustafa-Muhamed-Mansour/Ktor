package com.example

import com.example.plugin.configurationRouting
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

        // here install content, ok why?
          // because without وجود "a json || content" can't transformation تحويل from data class to json
                                // and showing me in "postman || browser"
        install(plugin = ContentNegotiation) {
            json()
        }

        // here i call function "configurationRouting" الذي inside it another function
                                       // "insertDataFromPostRequest" here i meaning the function يعني
                                          // insert data from post request "Postman" and receive data as a json
        configurationRouting()

    }.start(wait = true)

}




