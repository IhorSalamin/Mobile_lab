// build.gradle.kts (Project-level)

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

buildscript {
    val kotlin_version by extra("1.8.10")
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

tasks.register<Delete>("clean") {
    delete(layout.buildDirectory)
}
