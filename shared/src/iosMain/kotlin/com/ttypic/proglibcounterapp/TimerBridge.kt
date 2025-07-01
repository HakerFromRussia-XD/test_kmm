package com.ttypic.proglibcounterapp

//import kotlinx.cinterop.ObjCMethod
//import kotlin.native.internal.InternalForKotlinNative

//@OptIn(InternalForKotlinNative::class)
//@ObjCMethod("callFromKmmBridge")
//@ObjCFactory("callFromKmmBridge", encoding = "v@:", isStret=false)
//@CName("callFromKmmBridge")
//external fun nativeCall()

//@ObjCAction
//fun callFromKmmBridge() = nativeCall()
//@kotlinx.cinterop.BetaInteropApi
//@OptIn(kotlinx.cinterop.BetaInteropApi::class)
//@ObjCMethod("callFromKmmBridge")
import kotlinx.cinterop.ObjCMethod

@ObjCMethod("callFromKmmBridge", encoding = "v@:", isStret=false)
external fun callFromKmmBridge()

actual fun callFromKmm() {
    callFromKmmBridge()
}