package com.ttypic.proglibcounterapp

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.GCUnsafeCall

@OptIn(ExperimentalForeignApi::class)
@GCUnsafeCall("callFromKmmBridge")
external fun callFromKmmBridge()

actual fun callFromKmm() {
    callFromKmmBridge()
}