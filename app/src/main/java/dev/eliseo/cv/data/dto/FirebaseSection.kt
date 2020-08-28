package dev.eliseo.cv.data.dto

sealed class FirebaseSection(open val type: String, orderIndex: Int) {
    data class FirebaseHomeSection(
        val name: String,
        val surname: String,
        val jobTitle: String,
        override val type: String,
        val orderIndex: Int
    ) : FirebaseSection(type, orderIndex)
}