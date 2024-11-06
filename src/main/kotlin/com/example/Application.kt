package com.example

import com.example.plugin.insertValue
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {
    // here i insert value by using ktorm (i meaning يعني kotlin) by object الموجود in package entity and he "ProductModel"
            // and everyThing showing in sql

        insertValueByUsingKtorm()




    }.start(wait = true)

}


fun insertValueByUsingKtorm() {
    insertValue()
}



