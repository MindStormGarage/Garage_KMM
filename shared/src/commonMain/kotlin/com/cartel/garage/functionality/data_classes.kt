package com.cartel.garage.functionality

import kotlinx.serialization.Serializable

@Serializable
data class sign_up(
    val username: String,
    val email: String,
    val password: String
)

@Serializable
data class log_in(
    val username: String,
    val password: String)