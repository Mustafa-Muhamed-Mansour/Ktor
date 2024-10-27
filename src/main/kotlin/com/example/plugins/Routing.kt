package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


/* fun Application.sendRequestFromPostmanWithoutNoneQueryParameters() {
    routing {
        get("/") {
            println(message = "Uri:- ${call.request.uri}")
            println(message = "Headers:- ${call.request.headers}")
            println(message = "Header Names:- ${call.request.headers.names()}")
            println(message = "Header Name Of Accept:- ${call.request.header(name = "Accept")}")
            println(message = "Header Name Of Connection:- ${call.request.header(name = "Connection")}")
        }
    }
} */

fun Application.sendRequestFromPostmanWithQueryParameters() {
    routing {
        get("/") {
            println(message = "Header Name Of Accept:- ${call.request.header(name = "Accept")}")
            println(message = "Header Name Of Connection:- ${call.request.header(name = "Connection")}")
            println(message = "Query Parameter Names:- ${call.request.queryParameters.names()}")
            println(message = "Query Parameter Name Of Email:- ${call.request.queryParameters.get(name = "email")}")
            println(message = "Query Parameter Name Of Country:- ${call.request.queryParameters.get(name = "country")}")
        }
    }
}

