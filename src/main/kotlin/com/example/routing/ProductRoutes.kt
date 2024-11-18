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
import org.ktorm.dsl.*

fun Application.getDataAndDeleteDataSelectedOfPathByUsingId() {

    val db = DatabaseConnection.database

    getDataSelectedByUsingId(database = db)
    deleteDataSelectedByUsingId(database = db)

}

fun Application.getDataSelectedByUsingId(database: Database) {
    routing {
        get(path = "/deleteDataFromPostman") {

            val products = database
                .from(table = ProductModelForDatabase)
                .select()
                .map { mapOfProduct ->
                    val idOfMap = mapOfProduct[ProductModelForDatabase.id]
                    val product = mapOfProduct[ProductModelForDatabase.product]
                    ProductModelForData(id = idOfMap ?: 0, product = product ?: "null")
                }
            call.respond(status = HttpStatusCode.OK, message = products)
        }
    }
}

fun Application.deleteDataSelectedByUsingId(database: Database) {
    routing {
        delete("deleteDataFromPostman/{id}") {
            val id = call.parameters["id"]?.toInt() ?: 0

            val rowEffect = database
                .delete(table = ProductModelForDatabase) {
                        it.id eq id
                }

            if (rowEffect == 1) {
                call.respond(
                    status = HttpStatusCode.OK,
                    message = ProductResponse(
                        productData = "yes, product has been delete, that contain id = $id",
                        typeOfProduct = true
                    )
                )
            } else {
                call.respond(
                    status = HttpStatusCode.BadRequest,
                    message = ProductResponse(
                        productData = "sorry, not deleted this product because not found id = $id",
                        typeOfProduct = false
                    )
                )
            }
        }
    }
}