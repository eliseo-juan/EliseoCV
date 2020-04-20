object CoreDependencyVersion {
    const val KOTLIN_VERSION = "1.3.70"
    const val BUILD_GRADLE_VERSION = "3.6.1"
}

object CoreDependency {
    const val BUILD_GRADLE = "com.android.tools.build:gradle:${CoreDependencyVersion.BUILD_GRADLE_VERSION}"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${CoreDependencyVersion.KOTLIN_VERSION}"
}



