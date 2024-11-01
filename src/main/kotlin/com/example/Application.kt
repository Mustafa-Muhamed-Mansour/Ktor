package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

        /* without showing me */
        // openAnyThingWithoutShowing()


        /* with showing me */
        // openAnyThingWithShowing()

    }.start(wait = true)
}


   // here I open "file or image or anyThing" on the browser without showing me
/* fun Application.openAnyThingWithoutShowing() {
       openAnyThingWithoutShowingMe()
} */

   // here I open "file or image or anyThing" on the browser with showing me
/* fun Application.openAnyThingWithShowing() {
       openAnyThingWithShowingMe()
} */

