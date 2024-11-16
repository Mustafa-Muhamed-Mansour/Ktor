package com.example.plugin

import com.example.routing.getDataSelectedOfPathByUsingIdAndShowAsAJson
import io.ktor.server.application.*

fun Application.configurationRouting() {
    getDataSelectedOfPathByUsingIdAndShowAsAJson()
}