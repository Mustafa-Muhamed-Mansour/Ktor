package com.example.response

import kotlinx.serialization.Serializable

@Serializable
data class ProductResponse<T>(
    val productData: T,
    val typeOfProduct: Boolean
)
