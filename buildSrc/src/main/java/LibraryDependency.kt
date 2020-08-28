object LibraryDependencyVersion {
    const val RETROFIT = "2.7.1"
    const val OK_HTTP = "4.3.1"
    const val MOSHI = "1.9.3"

    const val KOIN = "2.1.4"

    const val COROUTINES_ANDROID = "1.3.2"

    const val ANDROIDX_CORE = "1.2.0"
    const val ANDROIDX_APPCOMPAT = "1.1.0"
    const val ANDROIDX_RECYCLER_VIEW = "1.1.0"
    const val ANDROIDX_COORDINATOR_LAYOUT = "1.1.0"
    const val ANDROIDX_VIEWPAGER_2 = "1.0.0"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "1.1.3"

    const val FRAGMENT_KTX = "1.1.0"
    const val LIFECYCLE = "1.1.1"
    const val LIFECYCLE_VIEW_MODEL_KTX = "2.2.0"

    const val MATERIAL = "1.1.0"

    const val FIREBASE_CORE = "17.0.0"
    const val FIREBASE_ANALYTICS = "17.2.2"
    const val FIREBASE_DATABASE = "19.3.1"

    const val KTLINT = "0.36.0"

    const val HILT = "2.28-alpha"
    const val HILT_VIEW_MODEL = "1.0.0-alpha01"
}

object LibraryDependency {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreDependencyVersion.KOTLIN_VERSION}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${LibraryDependencyVersion.RETROFIT}"
    const val OK_HTTP = "com.squareup.okhttp3:okhttp:${LibraryDependencyVersion.OK_HTTP}"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${LibraryDependencyVersion.OK_HTTP}"

    const val MOSHI = "com.squareup.moshi:moshi-kotlin:${LibraryDependencyVersion.MOSHI}"
    const val RETROFIT_MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:${LibraryDependencyVersion.RETROFIT}"

    const val KOIN_CORE = "org.koin:koin-core:${LibraryDependencyVersion.KOIN}"
    const val KOIN_ANDROIDX = "org.koin:koin-androidx-scope:${LibraryDependencyVersion.KOIN}"
    const val KOIN_VIEWMODEL = "org.koin:koin-androidx-viewmodel:${LibraryDependencyVersion.KOIN}"

    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibraryDependencyVersion.COROUTINES_ANDROID}"

    const val ANDROIDX_CORE = "androidx.core:core-ktx:${LibraryDependencyVersion.ANDROIDX_CORE}"
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${LibraryDependencyVersion.ANDROIDX_APPCOMPAT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${LibraryDependencyVersion.ANDROIDX_CONSTRAINT_LAYOUT}"
    const val ANDROIDX_VIEWPAGER_2 = "androidx.viewpager2:viewpager2:${LibraryDependencyVersion.ANDROIDX_VIEWPAGER_2}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${LibraryDependencyVersion.ANDROIDX_RECYCLER_VIEW}"
    const val COORDINATOR_LAYOUT = "androidx.coordinatorlayout:coordinatorlayout:${LibraryDependencyVersion.ANDROIDX_COORDINATOR_LAYOUT}"

    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${LibraryDependencyVersion.FRAGMENT_KTX}"
    const val LIFECYCLE_VIEW_MODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryDependencyVersion.LIFECYCLE_VIEW_MODEL_KTX}"
    const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${LibraryDependencyVersion.LIFECYCLE_VIEW_MODEL_KTX}"

    const val MATERIAL = "com.google.android.material:material:${LibraryDependencyVersion.MATERIAL}"

    const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics:${LibraryDependencyVersion.FIREBASE_ANALYTICS}"
    const val FIREBASE_DATABASE = "com.google.firebase:firebase-database-ktx:${LibraryDependencyVersion.FIREBASE_DATABASE}"
}