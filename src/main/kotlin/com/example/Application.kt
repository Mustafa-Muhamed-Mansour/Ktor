package com.example

import com.example.plugins.newPath_Or_NewModule
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

    /* make server but by "new path || new page || new module"  */
        newPathOrNewPage()

    }.start(wait = true)
}

  // here I make (a new path || a new page || a new module)
fun Application.newPathOrNewPage() {
      newPath_Or_NewModule()
}