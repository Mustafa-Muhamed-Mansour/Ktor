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
                                  // "getDataSelectedOfPathByUsingIdAndShowAsAJson" here i meaning the function يعني
                                      // get data selected of path by using id from post request "Postman"
                                                          // and show me data as a json
        configurationRouting()

    }.start(wait = true)

}




