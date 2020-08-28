package dev.eliseo.cv.data.mappers

import dev.eliseo.cv.data.dto.FirebaseSection
import dev.eliseo.cv.domain.model.Section

interface FirebaseHomeSectionMapper {
    fun FirebaseSection.toSection(): Section = when(this) {
        is FirebaseSection.FirebaseHomeSection -> Section.Home(
            name = this.name,
            surname = this.surname,
            title = this.jobTitle
        )
    }
}