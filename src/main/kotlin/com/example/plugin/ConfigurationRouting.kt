package com.example.plugin

import com.example.routing.getDataAndDeleteDataSelectedOfPathByUsingId
import io.ktor.server.application.*

fun Application.configurationRouting() {
    getDataAndDeleteDataSelectedOfPathByUsingId()
}