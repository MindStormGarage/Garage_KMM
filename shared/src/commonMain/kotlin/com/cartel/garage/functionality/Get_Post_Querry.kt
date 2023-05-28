package com.cartel.garage.functionality

import io.ktor.client.HttpClient
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BasicAuthCredentials
import io.ktor.client.plugins.auth.providers.basic
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.client.utils.EmptyContent.contentType
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable

class Get_Post_Querry:get_and_post_impl {
    private val URL="http://192.168.1.6:8080/"
    override fun client_for_post():HttpClient {
        return HttpClient(){
            install(ContentNegotiation) {
                json()
            }
        }
    }
    override fun client_with_cookies():HttpClient {
        return HttpClient() {
            install(Auth) {
                basic {
                    credentials {
                        BasicAuthCredentials(username = "jetbrains", password = "foobar")
                    }
                    realm = "Access to the '/' path"
                }
            }
        }
    }

    override suspend fun log_in(login: String, password: String, callback: (String) -> Unit) {
        callback(client_for_post().post(URL+"sign_in") {
            contentType(ContentType.Application.Json)
            setBody(log_in(login, password))
        }.bodyAsText())
    }
    override suspend fun sign_up(login: String, password: String, email: String, callback: (String) -> Unit) {
        callback(client_for_post().post(URL+"sign_up") {
            contentType(ContentType.Application.Json)
            setBody(sign_up(login, email, password))
        }.status.value.toString())
    }


    override suspend fun get_post() {
        TODO("Not yet implemented")
    }

    override suspend fun post_post() {
        TODO("Not yet implemented")
    }

    override suspend fun avatar() {
        TODO("Not yet implemented")
    }


    override suspend fun get_profile() {
        TODO("Not yet implemented")
    }
}


