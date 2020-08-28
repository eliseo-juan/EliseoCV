package dev.eliseo.cv.domain.model

sealed class Section {
    data class Home(val name: String, val surname: String, val title: String): Section()
    data class Slogan(val sloganText: String): Section()
    object Experience: Section()
    object Education: Section()
    object Portfolio: Section()
    object Contact: Section()
}