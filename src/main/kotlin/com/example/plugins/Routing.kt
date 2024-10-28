package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.getProductPageSelectedOfPath() {
    routing {
        get("/products/{page}") {
            val pageNumber = call.parameters["page"]
            call.respond(message = "Page of Product = $pageNumber")
        }
    }
}

