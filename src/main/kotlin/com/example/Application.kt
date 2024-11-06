package com.example

import com.example.plugin.deleteAllValues
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {
        // here i delete all values from sql by using ktorm (i meaning يعني kotlin)
        deleteAllValuesByUsingKtorm()

    }.start(wait = true)

}


fun deleteAllValuesByUsingKtorm() {
    deleteAllValues()
}

