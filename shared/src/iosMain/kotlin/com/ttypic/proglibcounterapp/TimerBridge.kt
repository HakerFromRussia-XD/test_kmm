package com.ttypic.proglibcounterapp

import kotlin.native.CName

@CName("callFromKmmBridge")
private external fun callFromKmmBridge()

actual fun callFromKmm() {
    callFromKmmBridge()
}