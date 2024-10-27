package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.newPath_Or_NewModule() {
    routing {
        get("/contact") {
            call.respondText(text = "Hello Ktor, this is the page a contact")
        }
    }
}

