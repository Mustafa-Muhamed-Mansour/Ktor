package com.example.routing

import com.example.database.DatabaseConnection
import com.example.entities.ProductModelForData
import com.example.entities.ProductModelForDatabase
import com.example.entities.ProductModelForInsertData
import com.example.response.ProductResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.ktorm.database.Database
import org.ktorm.dsl.from
import org.ktorm.dsl.insert
import org.ktorm.dsl.map
import org.ktorm.dsl.select

fun Application.insertDataAndGetDataFromPostRequest() {

    val db = DatabaseConnection.database

    insertData(database = db)
    getData(database = db)

}

fun Application.insertData(database: Database) {
    routing {
        post(path = "/getDataFromPostman") {
            val request = call.receive<ProductModelForInsertData>()
            val result = database.insert(ProductModelForDatabase) {
                set(column = it.product, value = request.product)
            }

            if (result == 1) {
                call.respond(
                    status = HttpStatusCode.OK,
                    message = ProductResponse(productData = "successfully, values is added", typeOfProduct = true)
                )
            } else {
                call.respond(
                    status = HttpStatusCode.BadRequest,
                    message = ProductResponse(productData = "failure, values is added", typeOfProduct = false)
                )
            }
        }
    }
}

fun Application.getData(database: Database) {
    routing {
        get(path = "/getDataFromPostman") {
            val products = database
                .from(table = ProductModelForDatabase)
                .select()
                .map { mapOfProduct ->
                    val id = mapOfProduct[ProductModelForDatabase.id]
                    val product = mapOfProduct[ProductModelForDatabase.product]
                    ProductModelForData(id = id ?: 0, product = product ?: "null")
                }
            call.respond(message = products)
        }
    }
}