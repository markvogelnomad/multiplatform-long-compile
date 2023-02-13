package com.nomadgcs.ntc

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.cookies.*
import io.ktor.client.plugins.resources.*
import io.ktor.client.plugins.websocket.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.websocket.*
import kotlin.js.json

val client = HttpClient {
    install(Resources)
    install(WebSockets)
    install(HttpCookies)
    install(ContentNegotiation) {
        json()
    }
}