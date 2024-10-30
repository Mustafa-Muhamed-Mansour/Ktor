package com.example

import com.example.plugins.addNewHeadersAndCookies
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {
        addNewHeaderAndCookie()

    }.start(wait = true)
}


   // here I add new "headers && cookies" and showing me in postman (in below side)
fun Application.addNewHeaderAndCookie() {
       addNewHeadersAndCookies()
}

