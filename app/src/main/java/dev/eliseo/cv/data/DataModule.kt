package dev.eliseo.cv.data

import dev.eliseo.cv.data.datasource.FirebaseDataSource
import dev.eliseo.cv.data.repository.SectionRepositoryImpl
import dev.eliseo.cv.domain.repository.SectionRepository
import org.koin.dsl.module

val sectionDataModule = module {

    factory { FirebaseDataSource() }

    single<SectionRepository> { SectionRepositoryImpl(get()) }
}