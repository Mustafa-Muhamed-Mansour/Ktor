package com.example.entity

import kotlinx.serialization.Serializable

@Serializable
data class UserModel(
    val email: String,
    val country: String,
    val city: String
)
