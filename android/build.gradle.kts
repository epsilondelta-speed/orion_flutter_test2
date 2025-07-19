plugins {
    id("com.android.library")
    kotlin("android")
}

buildscript {
    ext.kotlin_version = "1.8.22"
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
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
        unitTests.all {
            enabled = false
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


