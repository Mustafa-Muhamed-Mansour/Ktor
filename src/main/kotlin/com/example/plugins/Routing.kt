package com.example.plugins

import com.example.entity.UserModel
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.getRequestAboutJson() {
    routing {
        get(path = "/") {
            // here i get "request" from type data class < >
            val userModel = UserModel(name = "Mostafa Mohamed Mansour", phone = "01556044553", gender = "Male")
            call.respond(message = userModel)
        }
    }
}

