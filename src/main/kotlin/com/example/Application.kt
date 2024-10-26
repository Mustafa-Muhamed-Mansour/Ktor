package com.example

import com.example.plugins.makeServer_And_Returned_A_ResponseText
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

    /* make server and return responseText */
        makeServer_And_Return_A_ResponseText()

    }.start(wait = true)
}

  // here I make a server and return text with response
      // whatever install || don't install "Routing"
fun Application.makeServer_And_Return_A_ResponseText() {
      makeServer_And_Returned_A_ResponseText()
}