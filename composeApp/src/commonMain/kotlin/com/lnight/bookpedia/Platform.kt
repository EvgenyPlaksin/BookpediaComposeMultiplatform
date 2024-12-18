package com.lnight.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform