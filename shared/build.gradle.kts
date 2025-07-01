plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    applyDefaultHierarchyTemplate()      // современный вызов шаблона

    androidTarget()

    val iosX64 = iosX64()
    val iosArm64 = iosArm64()
    val iosSimArm64 = iosSimulatorArm64()

    listOf(iosX64, iosArm64, iosSimArm64).forEach {
        it.binaries.framework {
            baseName = "shared"
            export("com.arkivanov.decompose:decompose:1.0.0-alpha-07")
        }
    }

    sourceSets {
        /* ---------- общие ---------- */
        val commonMain by getting {
            dependencies {
                api("com.arkivanov.decompose:decompose:1.0.0-alpha-07")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
            }
        }
        val commonTest by getting { dependencies { implementation(kotlin("test")) } }

        /* ---------- Android ---------- */
        val androidMain by getting
        val androidUnitTest by getting

        /* ---------- iOS (один единственный блок) ---------- */
        val iosMain by getting {
            // dependsOn НЕ трогаем – шаблон уже связал iosMain → commonMain
            languageSettings.optIn("kotlin.native.internal.InternalForKotlinNative")
            languageSettings.optIn("kotlinx.cinterop.ExperimentalForeignApi")
            // сюда же можно добавлять iOS-специфические зависимости
        }

        /* iosTest создаёт шаблон, ничего добавлять не нужно
           если захочешь — пишешь val iosTest by getting { … } */
    }
}

android {
    namespace = "com.ttypic.proglibcounterapp"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }
}
