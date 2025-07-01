@file:OptIn(InternalForKotlinNative::class)

package com.ttypic.proglibcounterapp

import kotlinx.cinterop.ObjCMethod
import kotlin.native.internal.InternalForKotlinNative

@OptIn(InternalForKotlinNative::class)
@ObjCMethod("callFromKmmBridge")
external fun callFromKmmBridge()

actual fun callFromKmm() {
    callFromKmmBridge()
}