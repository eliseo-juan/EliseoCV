package dev.eliseo.cv.domain.repository

import dev.eliseo.cv.domain.model.Section

interface SectionRepository {

    suspend fun getSections() : List<Section>
    suspend fun getProfile() : Section.Home
    suspend fun getSlogan() : Section.Slogan
}