@file:OptIn(
    kotlin.experimental.ExperimentalNativeApi::class,
    kotlinx.cinterop.ExperimentalForeignApi::class
)

package com.ttypic.proglibcounterapp

import kotlinx.cinterop.ObjCMethod
//import kotlin.native.internal.InternalForKotlinNative

//@OptIn(InternalForKotlinNative::class)
@ObjCMethod("callFromKmmBridge", encoding = "v@:")
external fun callFromKmmBridge()

actual fun callFromKmm() {
    callFromKmmBridge()
}