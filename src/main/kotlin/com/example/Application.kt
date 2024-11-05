package com.example

import com.example.plugins.connectionWithDatabase
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.ktorm.database.Database

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {
        connectionKtorWithDatabase()
    }

 /* here I connection ktor with database " SQL " after installing program " MySQL Workbench "  */
    // url = localhost.port " 127.0.0.1:3306 " ---> in the first page in program MySQL when a open the project
    // driver = this library follow تبع the driver can to connect mySQL
    // url = userName " root " ---> in the first page in program MySQL when a open the project
    // password = password for me, i'm speeched كتبته when i install program MySQL Workbench
    val database = Database.connect(
        url = "jdbc:mysql://127.0.0.1:3306/products",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "password for you, you are speeched when you install program ^MySQL Workbench^ "
    )
}



fun Application.connectionKtorWithDatabase() {
       connectionWithDatabase()
}

