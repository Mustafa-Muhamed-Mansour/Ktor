package com.example.entities

import kotlinx.serialization.Serializable

@Serializable
data class ProductModelForData(
    val id: Int,
    val product: String
)
