package com.example

import com.example.plugin.readAllValues
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {
        // here i reading all values from sql by using ktorm (i meaning يعني kotlin)
        readAllValuesByUsingKtorm()

    }.start(wait = true)

}


fun readAllValuesByUsingKtorm() {
    readAllValues()
}

