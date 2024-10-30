package com.example.entity

import kotlinx.serialization.Serializable

@Serializable
data class UserModel(
    val name: String,
    val phone: String,
    val gender: String
)
