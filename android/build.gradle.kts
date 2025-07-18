plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "co.epsilondelta.orion_flutter"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

repositories {
    google()
    mavenCentral()

}

dependencies {
 implementation("com.squareup.okhttp3:okhttp:4.12.0")
        implementation("org.json:json:20231013")
}
