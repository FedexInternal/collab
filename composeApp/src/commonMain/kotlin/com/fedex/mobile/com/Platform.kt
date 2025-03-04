package com.fedex.mobile.com

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform