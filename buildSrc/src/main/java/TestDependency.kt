private object TestLibraryVersion {
    const val JUNIT = "4.13"
    const val TEST_RUNNER = "1.1.0"
    const val ESPRESSO_CORE = "3.2.0"
}

object TestLibraryDependency {

    const val JUNIT = "junit:junit:${TestLibraryVersion.JUNIT}"
    const val TEST_RUNNER =
        "androidx.test:runner:${TestLibraryVersion.TEST_RUNNER}"
    const val TEST_RULES =
        "androidx.test:rules:${TestLibraryVersion.TEST_RUNNER}"
    const val JUNIT_EXT =
        "androidx.test.ext:junit:${TestLibraryVersion.TEST_RUNNER}"
    const val ESPRESSO_CORE =
        "androidx.test.espresso:espresso-core:${TestLibraryVersion.ESPRESSO_CORE}"
    const val COROUTINES_TEST =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${LibraryDependencyVersion.COROUTINES_ANDROID}"

    const val KOIN_TEST = "org.koin:koin-test:${LibraryDependencyVersion.KOIN}"
}