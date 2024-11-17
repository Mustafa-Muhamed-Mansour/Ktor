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

fun Application.getDataSelectedOfPathByUsingIdAndShowAsAJson() {

    val db = DatabaseConnection.database

    getDataSelectedByUsingId(database = db)
    updateDataSelectedByUsingId(database = db)

}

fun Application.getDataSelectedByUsingId(database: Database) {
    routing {
        get(path = "/updateDataFromPostman/{id}") {

            val id = call.parameters["id"]?.toInt() ?: 0

            val products = database
                .from(table = ProductModelForDatabase)
                .select()
                .where(condition = ProductModelForDatabase.id eq id)
                .map { mapOfProduct ->
                    val idOfMap = mapOfProduct[ProductModelForDatabase.id]
                    val product = mapOfProduct[ProductModelForDatabase.product]
                    ProductModelForData(id = idOfMap ?: 0, product = product ?: "null")
                }

            if (products.isNullOrEmpty()) {
                call.respond(
                    status = HttpStatusCode.NotFound,
                    message = ProductResponse(
                        productData = "sorry, not found product in id = $id",
                        typeOfProduct = false
                    )
                )
            } else {
                call.respond(
                    status = HttpStatusCode.OK,
                    message = ProductResponse(productData = products, typeOfProduct = true)
                )
            }
        }
    }
}

fun Application.updateDataSelectedByUsingId(database: Database) {
    routing {
        put("updateDataFromPostman/{id}") {
            val id = call.parameters["id"]?.toInt() ?: 0
            val updateProduct = call.receive<ProductModelForInsertData>()

            val rowEffect = database
                .update(ProductModelForDatabase) {
                    set(column = it.product, value = updateProduct.product)
                    where {
                        it.id eq id
                    }
                }

            if (rowEffect == 1) {
                call.respond(
                    status = HttpStatusCode.OK,
                    message = ProductResponse(
                        productData = "yes, product has been updated, that contain id = $id",
                        typeOfProduct = true
                    )
                )
            } else {
                call.respond(
                    status = HttpStatusCode.BadRequest,
                    message = ProductResponse(
                        productData = "sorry, not found this product because not found id",
                        typeOfProduct = false
                    )
                )
            }
        }
    }
}