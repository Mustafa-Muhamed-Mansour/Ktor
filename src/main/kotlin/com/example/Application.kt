package com.example

import com.example.plugin.deleteValueSelected
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {
        // here i delete value selected by using ktorm (i meaning يعني kotlin) by object الموجود in package entity and he "ProductModel"
            // and everyThing showing in sql
        deleteValueSelectedByUsingKtorm()

    }.start(wait = true)

}


fun deleteValueSelectedByUsingKtorm() {
    deleteValueSelected()
}



