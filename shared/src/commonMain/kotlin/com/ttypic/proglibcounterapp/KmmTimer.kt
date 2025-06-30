package com.ttypic.proglibcounterapp

import kotlinx.coroutines.*
import kotlin.native.concurrent.ThreadLocal

@ThreadLocal
object KmmTimer {
    private var started = false

    fun start() {
        if (!started) {
            started = true
            CoroutineScope(Dispatchers.Default).launch {
                while (true) {
                    callFromKmm()
                    delay(1000)
                }
            }
        }
    }
}