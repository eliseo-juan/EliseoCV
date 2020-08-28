object CoreDependencyVersion {
    const val KOTLIN_VERSION = "1.3.70"
    const val BUILD_GRADLE_VERSION = "3.6.1"
    const val GOOGLE_SERVICES_GRADLE_VERSION = "4.3.3"
}

object CoreDependency {
    const val BUILD_GRADLE = "com.android.tools.build:gradle:${CoreDependencyVersion.BUILD_GRADLE_VERSION}"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${CoreDependencyVersion.KOTLIN_VERSION}"
    const val GOOGLE_SERVICES_GRADLE_PLUGIN = "com.google.gms:google-services:${CoreDependencyVersion.GOOGLE_SERVICES_GRADLE_VERSION}"
}



