package com.ttypic.proglibcounterapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform