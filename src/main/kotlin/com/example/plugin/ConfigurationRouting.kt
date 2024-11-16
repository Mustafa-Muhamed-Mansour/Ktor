package com.example.plugin

import com.example.routing.insertDataAndGetDataFromPostRequest
import io.ktor.server.application.*

fun Application.configurationRouting() {
    insertDataAndGetDataFromPostRequest()
}