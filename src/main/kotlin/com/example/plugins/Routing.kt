package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.addNewHeadersAndCookies() {
    routing {
        get(path = "/addNewHeadersAndCookies") {
            call.response.headers.append(name = "New-Header", value = "This is a new header")
            call.response.cookies.append(name = "New-Cookies", value = "This is a new cookies")
            call.respond(message = "Done, the header and cookies were added")
        }
    }
}

