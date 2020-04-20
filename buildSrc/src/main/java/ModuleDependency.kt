object LibraryDependencyVersion {
    const val RETROFIT = "2.7.1"
    const val OK_HTTP = "4.3.1"

    const val KOIN = "2.1.4"

    const val COROUTINES_ANDROID = "1.3.2"

    const val ANDROIDX_CORE = "1.2.0"
    const val ANDROIDX_APPCOMPAT = "1.1.0"
    const val ANDROIDX_RECYCLER_VIEW = "1.1.0"
    const val ANDROIDX_COORDINATOR_LAYOUT = "1.1.0"
    const val CONSTRAINT_LAYOUT = "1.1.3"

    const val FRAGMENT_KTX = "1.1.0"
    const val LIFECYCLE = "1.1.1"
    const val LIFECYCLE_VIEW_MODEL_KTX = "2.2.0"


    const val MATERIAL = "1.1.0"

    const val KTLINT = "0.36.0"
}

object LibraryDependency {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreDependencyVersion.KOTLIN_VERSION}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${LibraryDependencyVersion.RETROFIT}"
    const val RETROFIT_MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:${LibraryDependencyVersion.RETROFIT}"
    const val OK_HTTP = "com.squareup.okhttp3:okhttp:${LibraryDependencyVersion.OK_HTTP}"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${LibraryDependencyVersion.OK_HTTP}"

    const val KOIN_CORE = "org.koin:koin-core:${LibraryDependencyVersion.KOIN}"
    const val KOIN_ANDROIDX = "org.koin:koin-androidx-scope:${LibraryDependencyVersion.KOIN}"
    const val KOIN_VIEWMODEL = "org.koin:koin-androidx-viewmodel:${LibraryDependencyVersion.KOIN}"

    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibraryDependencyVersion.COROUTINES_ANDROID}"

    const val ANDROIDX_CORE = "androidx.core:core-ktx:${LibraryDependencyVersion.ANDROIDX_CORE}"
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${LibraryDependencyVersion.ANDROIDX_APPCOMPAT}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${LibraryDependencyVersion.ANDROIDX_RECYCLER_VIEW}"
    const val COORDINATOR_LAYOUT = "androidx.coordinatorlayout:coordinatorlayout:${LibraryDependencyVersion.ANDROIDX_COORDINATOR_LAYOUT}"

    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${LibraryDependencyVersion.FRAGMENT_KTX}"
    const val LIFECYCLE_EXTENSIONS = "android.arch.lifecycle:extensions:${LibraryDependencyVersion.LIFECYCLE}"
    const val LIFECYCLE_VIEW_MODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryDependencyVersion.LIFECYCLE_VIEW_MODEL_KTX}"
    const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${LibraryDependencyVersion.LIFECYCLE_VIEW_MODEL_KTX}"

    const val MATERIAL = "com.google.android.material:material:${LibraryDependencyVersion.MATERIAL}"

    const val SUPPORT_CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${LibraryDependencyVersion.CONSTRAINT_LAYOUT}"
}



