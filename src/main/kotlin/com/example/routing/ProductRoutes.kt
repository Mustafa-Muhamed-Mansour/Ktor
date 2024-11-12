package com.example.routing

import com.example.database.DatabaseConnection
import com.example.entities.ProductModelForData
import com.example.entities.ProductModelForDatabase
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.ktorm.dsl.from
import org.ktorm.dsl.map
import org.ktorm.dsl.select

fun Application.productRoutes() {

    val db = DatabaseConnection.database
    routing {
        get(path = "/getDataAsAJsonFromDB") {
            val products = db
                .from(table = ProductModelForDatabase)
                .select()
                .map { mapOfProduct->
                    val id = mapOfProduct[ProductModelForDatabase.id]
                    val product = mapOfProduct[ProductModelForDatabase.product]
                    ProductModelForData(id = id ?: 0, product = product ?: "null")
                }
            call.respond(message = products)
        }
    }
}