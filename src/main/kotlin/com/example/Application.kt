package com.example

import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {
    /* without install */
    // withoutInstall()

    /* with install */
    // install(plugin = Routing) {
    // withInstall()
    // }

    }.start(wait = true)
}

  // here i don't install the plugin "Routing",  why?
    // because i define extension func. as an "Application" so it's not important to install
/* fun Application.withoutInstall() {
    configureWithoutInstallRouting()
} */

  // here i did install the plugin "Routing",  why?
    // because i define extension func. as an "Routing" so it's important to install
/* fun Routing.withInstall() {
      configureWithInstallRouting()
} */