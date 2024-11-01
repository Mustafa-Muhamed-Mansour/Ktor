package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File


/* fun Application.downloadAnyThingWithoutShowingMe() {
    routing {
        get(path = "/downloadWithoutShowingMe") {
            call.response.header(
                name = HttpHeaders.ContentDisposition,
                value = ContentDisposition.Attachment.withParameter(
                    key = ContentDisposition.Parameters.FileName,
                    value = "download The Thing.jpg"
                ).toString()
            )

            call.respond(message = "done, downloaded the thing ......")
        }
    }
} */

/* fun Application.downloadAnyThingWithShowingMe() {
    routing {
        get(path = "/downloadWithShowingMe") {
            val file = File("files/cat.png")
            call.response.header(
                name = HttpHeaders.ContentDisposition,
                value = ContentDisposition.Attachment.withParameter(
                    key = ContentDisposition.Parameters.FileName,
                    value = "download The Thing.jpg"
                ).toString()
            )

            call.respondFile(file = file)
        }
    }
} */

