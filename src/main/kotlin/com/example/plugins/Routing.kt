package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.connectionWithDatabase() {
    routing {
        get(path = "/connectionWithDB") {
            call.respond(message = "done, successfully connection ktor with database ^sql^ ")
        }
    }
}