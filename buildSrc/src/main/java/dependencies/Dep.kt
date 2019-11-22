package dependencies

object Dep {
    object GradlePlugin {
        val android = "com.android.tools.build:gradle:3.4.2"
        val r8 = "com.android.tools.r8:1.3.52"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    }

    object Kotlin {
        val version = "1.3.41"
        val kotlin_jdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${version}"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.0.2"
        val core = "androidx.core:core-ktx:1.0.2"
        val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    }

    object Support {
        val persent = ""
    }
}