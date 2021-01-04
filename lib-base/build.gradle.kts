import dev.eliseo.cv.buildsrc.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)
        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        allWarningsAsErrors = false
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.Kotlin.reflect)

    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.appCompat)

    implementation(Libs.AndroidX.fragmentKtx)
    implementation(Libs.Lifecycle.viewmodel)
    implementation(Libs.Lifecycle.runtimeKtx)
    implementation(Libs.Lifecycle.livedata)

    implementation(Libs.material)

    implementation(Libs.Coroutines.android)
}
