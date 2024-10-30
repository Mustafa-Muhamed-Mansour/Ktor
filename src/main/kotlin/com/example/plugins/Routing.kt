package com.example.plugins

import com.example.entity.UserModel
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.receiveDataOrRequest() {
    routing {
        post(path = "/login") {
            // here i receive "data || request" from type data class < > and i selected type a status
            val userModel = call.receive<UserModel>()
            call.respondText(text = "E-mail = ${userModel.email}", status = HttpStatusCode.Found)
        }
    }
}

