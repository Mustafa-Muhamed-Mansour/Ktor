package com.example.entities

import kotlinx.serialization.Serializable

@Serializable
data class ProductModelForInsertData(
    val product: String
)
