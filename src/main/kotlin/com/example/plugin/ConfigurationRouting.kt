package com.example.plugin

import com.example.routing.productRoutes
import io.ktor.server.application.*

fun Application.configurationRouting() {
    productRoutes()
}