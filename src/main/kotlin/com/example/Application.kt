package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

        /* without showing me */
        // downloadAnyThingWithoutShowing()

        /* with showing me */
        // downloadAnyThingWithShowing()

    }.start(wait = true)
}


   // here I get download "file or image or anyThing" from the server without showing me
/* fun Application.downloadAnyThingWithoutShowing() {
       downloadAnyThingWithoutShowingMe()
} */

   // here I get download "file or image or anyThing" from the server with showing me
/* fun Application.downloadAnyThingWithShowing() {
       downloadAnyThingWithShowingMe()
} */

