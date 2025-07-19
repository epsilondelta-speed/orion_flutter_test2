// build.gradle.kts for your orion_flutter Android library module

plugins {
    id("com.android.library")
    kotlin("android")
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22")
    }
}

allprojects {
    repositories {
        google()
        mavenCenter()
    }
}

android {
    namespace = "co.epsilondelta.orion_flutter"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    testOptions {
        unitTests.apply {
            // Correct way to disable unit tests in Kotlin DSL for `testOptions.unitTests`
            // `isIncludeAndroidResources` might also be available here if you want to include Android resources
            isIncludeAndroidResources = false // Set this to false to effectively disable them, or comment out entirely
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    dependencies {
        implementation("com.squareup.okhttp3:okhttp:4.12.0")
        implementation("org.json:json:20231013")
    }
}

repositories {
    google()
    mavenCentral()
}
