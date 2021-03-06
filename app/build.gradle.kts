import dev.eliseo.cv.buildsrc.AndroidConfig
import dev.eliseo.cv.buildsrc.Libs
import dev.eliseo.cv.buildsrc.ModuleDependency

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.google.gms.google-services")
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        applicationId = AndroidConfig.APPLICATION_ID
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)
        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME

        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    api(project(ModuleDependency.BASE))

    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.Kotlin.reflect)

    implementation(Libs.Koin.core)
    implementation(Libs.Koin.androidX)
    implementation(Libs.Koin.viewModel)

    implementation(Libs.Lifecycle.viewmodel)
    implementation(Libs.Lifecycle.runtimeKtx)

    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.appCompat)
    implementation(Libs.AndroidX.recyclerView)
    implementation(Libs.AndroidX.viewPager2)
    implementation(Libs.AndroidX.constraintLayout)

    implementation(Libs.AndroidX.fragmentKtx)

    implementation(Libs.material)

    implementation(Libs.Firebase.analytics)
    implementation(Libs.Firebase.database)

    implementation(Libs.Coroutines.android)

    implementation(Libs.Moshi.core)
}