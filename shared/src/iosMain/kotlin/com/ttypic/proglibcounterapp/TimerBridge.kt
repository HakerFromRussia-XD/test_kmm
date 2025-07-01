package com.ttypic.proglibcounterapp

import kotlinx.cinterop.ObjCMethod

@ObjCMethod("callFromKmmBridge")
external fun callFromKmmBridge()

actual fun callFromKmm() {
    callFromKmmBridge()
}