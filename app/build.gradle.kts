plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt") version "2.1.0"
}

android {
    namespace = "com.example.room"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.room"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // Room
    implementation (libs.androidx.room.runtime)

    kapt (libs.androidx.room.compiler)
    implementation (libs.androidx.room.ktx)

    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.common.java8)

    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.recyclerview.selection)

    implementation(libs.kotlin.stdlib.jdk7)
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-core:$rootProject.coroutines")
    api (libs.kotlinx.coroutines.android)
}