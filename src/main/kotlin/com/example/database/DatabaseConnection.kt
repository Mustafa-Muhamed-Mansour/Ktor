package com.example.database

import org.ktorm.database.Database

object DatabaseConnection {
    /* here I connection ktor with database " SQL " after installing program " MySQL Workbench "  */
    // url = localhost.port " 127.0.0.1:3306 " ---> in the first page in program MySQL when a open the project
    // driver = this library follow تبع the driver can to connect mySQL
    // url = userName " root " ---> in the first page in program MySQL when a open the project
    // password = password for me, i'm speeched كتبته when i install program MySQL Workbench
    val database = Database.connect(
        url = "jdbc:mysql://127.0.0.1:3306/products",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "MostAfA01556044553%"
    )
}