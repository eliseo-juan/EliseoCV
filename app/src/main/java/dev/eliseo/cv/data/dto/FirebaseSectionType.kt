package dev.eliseo.cv.data.dto

enum class FirebaseSectionType(typeString: String) {
    HOME("home");

    companion object {
        fun valueOfOrNull(key: String): FirebaseSectionType? = try {
            valueOf(key)
        } catch (e: IllegalArgumentException) {
            null
        }
    }
}