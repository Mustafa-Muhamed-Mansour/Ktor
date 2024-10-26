package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.makeServer_And_Returned_A_ResponseText() {
    routing {
        get("/") {
            call.respondText(text = "Hello Ktor")
        }
    }
}

