package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File


/* fun Application.openAnyThingWithoutShowingMe() {
    routing {
        get(path = "/openWithoutShowingMe") {
            call.response.header(
                name = HttpHeaders.ContentDisposition,
                value = ContentDisposition.Inline.withParameter(
                    key = ContentDisposition.Parameters.FileName,
                    value = "open The Thing.jpg"
                ).toString()
            )

            call.respond(message = "done, the thing opened ......")
        }
    }
} */


/* fun Application.openAnyThingWithShowingMe() {
    routing {
        get(path = "/openWithShowingMe") {
            val file = File("files/cat.png")
            call.response.header(
                name = HttpHeaders.ContentDisposition,
                value = ContentDisposition.Inline.withParameter(
                    key = ContentDisposition.Parameters.FileName,
                    value = "open The Thing.jpg"
                ).toString()
            )

            call.respondFile(file = file)
        }
    }
} */

