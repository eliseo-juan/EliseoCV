import dev.eliseo.cv.buildsrc.Libs

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
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

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

     kotlinOptions {
         jvmTarget = "1.8"
         allWarningsAsErrors = true
     }

     buildFeatures {
         compose = true
     }

     composeOptions {
         kotlinCompilerVersion = Libs.Kotlin.version
         kotlinCompilerExtensionVersion = Libs.AndroidX.Compose.version
     }
}

dependencies {
    api(project(":lib-base"))

    implementation(Libs.Kotlin.stdlib)

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

    implementation(Libs.AndroidX.Compose.core)
    implementation(Libs.AndroidX.Compose.layout)
    implementation(Libs.AndroidX.Compose.material)
    implementation(Libs.AndroidX.Compose.materialIconsExtended)
    implementation(Libs.AndroidX.Compose.tooling)
    implementation(Libs.AndroidX.Compose.runtime)
    implementation(Libs.AndroidX.Compose.runtimeLivedata)

    implementation(Libs.AndroidX.fragmentKtx)

    implementation(Libs.material)

    implementation(Libs.Firebase.analytics)
    implementation(Libs.Firebase.database)

    implementation(Libs.Coroutines.android)

    implementation(Libs.Moshi.core)
}