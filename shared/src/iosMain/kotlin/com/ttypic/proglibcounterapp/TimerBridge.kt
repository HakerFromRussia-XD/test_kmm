package com.ttypic.proglibcounterapp

import kotlin.experimental.ExperimentalForeignApi
import kotlin.native.internal.GCUnsafeCall

@OptIn(ExperimentalForeignApi::class)
@GCUnsafeCall("callFromKmmBridge")
external fun callFromKmmBridge()

actual fun callFromKmm() {
    callFromKmmBridge()
}