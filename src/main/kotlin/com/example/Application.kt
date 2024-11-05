package com.example

import com.example.entity.ProductModel
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.ktorm.database.Database
import org.ktorm.dsl.delete
import org.ktorm.dsl.eq
import org.ktorm.dsl.insert

fun main() {
    embeddedServer(factory = Netty, port = 8888, host = "127.0.0.1") {

    /* here I connection ktor with database " SQL " after installing program " MySQL Workbench "  */
      // url = localhost.port " 127.0.0.1:3306 " ---> in the first page in program MySQL when a open the project
      // driver = this library follow تبع the driver can to connect mySQL
      // url = userName " root " ---> in the first page in program MySQL when a open the project
      // password = password for me, i'm speeched كتبته when i install program MySQL Workbench
        val database = Database.connect(
            url = "jdbc:mysql://127.0.0.1:3306/products",
            driver = "com.mysql.cj.jdbc.Driver",
            user = "root",
            password = "password for you"
        )


      // here i delete value selected by using ktorm (i meaning يعني kotlin) by object الموجود in package entity and he "ProductModel"
            // and everyThing showing in sql
        database.delete(table = ProductModel) {
            it.id eq 2
        }


    }.start(wait = true)

}




