package dev.eliseo.cv.data.repository

import dev.eliseo.cv.data.datasource.FirebaseDataSource
import dev.eliseo.cv.domain.model.Section
import dev.eliseo.cv.domain.repository.SectionRepository

class SectionRepositoryImpl constructor(
    private val dataSource: FirebaseDataSource
) : SectionRepository {

    override suspend fun getSections(): List<Section> =
        dataSource.getSections()

    override suspend fun getProfile(): Section.Home =
        dataSource.getSections().first { it is Section.Home } as Section.Home

    override suspend fun getSlogan(): Section.Slogan =
        dataSource.getSections().first { it is Section.Slogan } as Section.Slogan
}