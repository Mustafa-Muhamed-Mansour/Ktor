package com.example

import com.example.plugin.updateValue
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

    // here i update value by using ktorm (i meaning يعني kotlin) by "id"
            // and everyThing showing in sql
        updateValueByUsingKtorm()


    }.start(wait = true)

}


fun updateValueByUsingKtorm() {
    updateValue()
}



