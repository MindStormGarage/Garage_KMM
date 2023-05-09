package com.cartel.garage

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform