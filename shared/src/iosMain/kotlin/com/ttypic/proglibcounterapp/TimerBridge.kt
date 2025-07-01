package com.ttypic.proglibcounterapp

import kotlin.native.internal.GCUnsafeCall
//import kotlin.experimental.ExperimentalForeignApi
//import kotlinx.cinterop.ExperimentalForeignApi

//import kotlin.native.internal.GCUnsafeCall

//@OptIn(ExperimentalForeignApi::class)
//@GCUnsafeCall("callFromKmmBridge")
//import kotlinx.cinterop.CName

//@CName("callFromKmmBridge")
//import kotlinx.cinterop.CName
//import kotlin.native.internal.GCUnsafeCall
//import kotlin.experimental.ExperimentalForeignApi

//@OptIn(ExperimentalForeignApi::class)
//@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)


@file:OptIn(
    kotlin.native.internal.InternalForKotlinNative::class,
    kotlinx.cinterop.ExperimentalForeignApi::class
)

//@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
@GCUnsafeCall("callFromKmmBridge")
external fun callFromKmmBridge()

actual fun callFromKmm() {
    callFromKmmBridge()
}