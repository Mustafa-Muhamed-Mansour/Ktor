package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.sendDataOrRequestByBody() {
    routing {
        post(path = "/login") {
            call.respond(message = "Login is done")
        }
    }
}

