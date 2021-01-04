import dev.eliseo.cv.buildsrc.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(dev.eliseo.cv.buildsrc.AndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(dev.eliseo.cv.buildsrc.AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(dev.eliseo.cv.buildsrc.AndroidConfig.TARGET_SDK_VERSION)
        versionCode = dev.eliseo.cv.buildsrc.AndroidConfig.VERSION_CODE
        versionName = dev.eliseo.cv.buildsrc.AndroidConfig.VERSION_NAME

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
