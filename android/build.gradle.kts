// build.gradle.kts for your orion_flutter Android library module

plugins {
    // Apply the Android Library plugin
    id("com.android.library")
    // Apply the Kotlin Android plugin
    kotlin("android")
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        // Android Gradle Plugin (AGP) - necessary for building Android projects
        classpath("com.android.tools.build:gradle:8.1.0")
        // Kotlin Gradle Plugin - necessary for compiling Kotlin code
        // The version here should ideally match your project's main Kotlin version,
        // but for a library, it might be slightly different.
        // I've hardcoded it as 1.8.22 as per your original file.
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22")
    }
}

// These repositories are typically defined at the root project's build.gradle
// or settings.gradle.kts. For a library module, it's often sufficient
// to have them defined in the root project that consumes this library.
// However, including them here ensures this module can resolve its own dependencies
// if built in isolation or by certain build configurations.
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

android {
    // Defines the unique package name for your library.
    namespace = "co.epsilondelta.orion_flutter"

    // The API level your library is compiled against.
    // Using 35 (latest stable as of this knowledge cutoff) is good for modern features.
    compileSdk = 35

    defaultConfig {
        // The minimum API level required to run your library.
        minSdk = 21
        // The API level your app is designed to run on.
        // It should generally be the latest stable API level.
        targetSdk = 34
    }

    buildFeatures {
        // Enables generation of BuildConfig.java (or BuildConfig.kt) file.
        buildConfig = true
    }

    compileOptions {
        // Specifies Java compatibility for source code.
        sourceCompatibility = JavaVersion.VERSION_1_8
        // Specifies Java compatibility for compiled bytecode.
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    testOptions {
        unitTests.all {
            // Disables unit tests for this module.
            // Be cautious with this in production, usually tests are enabled.
            enabled = false
        }
    }

    kotlinOptions {
        // Specifies the JVM target version for Kotlin compilation.
        jvmTarget = "1.8"
    }

    dependencies {
        // OKHttp for network operations
        implementation("com.squareup.okhttp3:okhttp:4.12.0")
        // org.json for JSON parsing (though usually Moshi or Gson are preferred in Kotlin/Android)
        implementation("org.json:json:20231013")
    }
}

// This `repositories` block at the root level of the script is generally
// not needed for a library module if `allprojects` is already defined
// or if the root project's `settings.gradle.kts` handles repositories.
// However, it doesn't cause harm and can sometimes resolve issues in complex setups.
repositories {
    google()
    mavenCentral()
}
