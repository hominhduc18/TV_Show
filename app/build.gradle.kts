@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.chatwithstream"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.chatwithstream"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        //noinspection DataBindingWithoutKapt
        dataBinding = true
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

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // retrofit

    implementation(libs.retrofit)
    implementation(libs.gson)
    // Picasso
    implementation(libs.picasso)
    // // Room & RxJava Support
    implementation(libs.runtime)
    annotationProcessor(libs.anotation)
    implementation(libs.rx)

    // Rx_Java

    implementation(libs.rxJava)
    // Scalable Size Units
    implementation(libs.sdp)
    implementation(libs.ssp)
// Rounded Image View
    implementation(libs.imageView)



    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
}