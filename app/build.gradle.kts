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
}

dependencies {
    api(project(":lib-base"))
    api(project(":app:domain"))

    implementation(LibraryDependency.KOTLIN)

    implementation(LibraryDependency.KOIN_CORE)
    implementation(LibraryDependency.KOIN_ANDROIDX)
    implementation(LibraryDependency.KOIN_VIEWMODEL)

    implementation(LibraryDependency.FRAGMENT_KTX)
    implementation(LibraryDependency.LIFECYCLE_VIEW_MODEL_KTX)
    implementation(LibraryDependency.LIFECYCLE_RUNTIME_KTX)

    implementation(LibraryDependency.ANDROIDX_CORE)
    implementation(LibraryDependency.ANDROIDX_APPCOMPAT)
    implementation(LibraryDependency.RECYCLER_VIEW)
    implementation(LibraryDependency.ANDROIDX_VIEWPAGER_2)
    implementation(LibraryDependency.ANDROIDX_CONSTRAINT_LAYOUT)

    implementation(LibraryDependency.MATERIAL)
    implementation(LibraryDependency.FIREBASE_ANALYTICS)
    implementation(LibraryDependency.FIREBASE_DATABASE)

    implementation(LibraryDependency.COROUTINES_ANDROID)

    implementation(LibraryDependency.MOSHI)

    testImplementation(TestLibraryDependency.JUNIT)
    androidTestImplementation(TestLibraryDependency.JUNIT_EXT)
    androidTestImplementation(TestLibraryDependency.ESPRESSO_CORE)
}