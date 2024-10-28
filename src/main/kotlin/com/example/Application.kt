package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

    /* without none query parameters */
    // sendRequestFromPostmanWithoutNoneQuery()
    /* with query parameters */
    // sendRequestFromPostmanWithQuery()

    }.start(wait = true)
}

   // here I send request from postman without none query parameters
      // ( بالفعل الـ query parameter موجودة عندي في لينك الـ api )

 /* fun Application.sendRequestFromPostmanWithoutNoneQuery() {
      sendRequestFromPostmanWithoutNoneQueryParameters()
} */

   // here I send request from postman with query parameters
      // ( بالفعل الـ query parameter موجودة عندي في لينك الـ api )

 /* fun Application.sendRequestFromPostmanWithQuery() {
     sendRequestFromPostmanWithQueryParameters()
} */