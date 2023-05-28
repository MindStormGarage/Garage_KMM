package com.cartel.garage.functionality

import io.ktor.client.HttpClient

interface get_and_post_impl {
    fun client_for_post():HttpClient
    fun client_with_cookies():HttpClient
    suspend fun log_in(login:String,password:String,callback: (String) -> Unit)
    suspend fun sign_up(login: String,password: String,email:String,callback: (String) -> Unit)
    suspend fun get_post()
    suspend fun post_post()
    suspend fun avatar()
    suspend fun get_profile()
}
