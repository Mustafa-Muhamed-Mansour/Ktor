package com.example.plugin

import com.example.entity.ProductModel
import org.ktorm.database.Database
import org.ktorm.dsl.insert


fun insertValue() {
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

    database.insert(table = ProductModel) {
//        set(column = it.product , value = "Welcome to Ktor")
        set(column = it.product, value = "Welcome to ktorm")
    }
}