package com.example

import com.example.plugins.getProductPageSelectedOfPath
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

        getProductPageSelected()

    }.start(wait = true)
}


   // here I Get Product Page Selected Of Path
fun Application.getProductPageSelected() {
    getProductPageSelectedOfPath()
}