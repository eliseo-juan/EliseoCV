package dev.eliseo.cv.buildsrc

object Versions {
    const val ktlint = "0.37.0"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:4.2.0-alpha08"
    const val googleServicesGradlePlugin = "com.google.gms:google-services:4.3.3"


    object Kotlin {
        const val version = "1.4.0"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.3.9"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object Lifecycle {
        private const val version = "2.2.0"
        const val extensions = "androidx.lifecycle:lifecycle-extensions:$version"
        const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"

    }

    object Firebase {
        const val analytics = "com.google.firebase:firebase-analytics:17.2.2"
        const val database = "com.google.firebase:firebase-database-ktx:19.3.1"
    }

    object Retrofit {
        const val retrofit_version = "2.7.1"
        private const val ok_http_version = "4.3.1"
        const val core = "com.squareup.retrofit2:retrofit:$retrofit_version"
        const val okHttp = "com.squareup.okhttp3:okhttp:$ok_http_version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$ok_http_version"
    }

    object Moshi {
        const val core = "com.squareup.moshi:moshi-kotlin:1.9.3"
        const val converter = "com.squareup.retrofit2:converter-moshi:${Retrofit.retrofit_version}"
    }

    object Koin {
        private const val version = "2.1.4"
        const val core = "org.koin:koin-core:$version"
        const val androidX = "org.koin:koin-androidx-scope:$version"
        const val viewModel = "org.koin:koin-androidx-viewmodel:$version"
    }

    object AndroidX {

        const val coreKtx = "androidx.core:core-ktx:1.2.0"
        const val appCompat = "androidx.appcompat:appcompat:1.1.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val viewPager2 = "androidx.viewpager2:viewpager2:1.0.0"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
        const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"

        const val fragmentKtx = "androidx.fragment:fragment-ktx:1.1.0"

        object Compose {
            const val version = "1.0.0-alpha01"
            const val core = "androidx.compose.ui:ui:$version"
            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val material = "androidx.compose.material:material:$version"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
            const val tooling = "androidx.ui:ui-tooling:$version"
            const val test = "androidx.compose.test:test-core:$version"
            const val uiTest = "androidx.ui:ui-test:$version"
        }

    }

    const val material = "com.google.android.material:material:1.1.0"

    object Test {
        private const val version = "1.2.0"
        const val core = "androidx.test:core:$version"
        const val rules = "androidx.test:rules:$version"

        object Ext {
            private const val version = "1.1.2-rc01"
            const val junit = "androidx.test.ext:junit-ktx:$version"
        }

        const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
    }
}

