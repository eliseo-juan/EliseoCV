package dev.eliseo.cv.data.datasource

import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import dev.eliseo.cv.data.dto.FirebaseData
import dev.eliseo.cv.data.dto.FirebaseSection
import dev.eliseo.cv.data.extension.getValue
import dev.eliseo.cv.data.mappers.FirebaseHomeSectionMapper
import dev.eliseo.cv.domain.model.Section

class FirebaseDataSource : FirebaseHomeSectionMapper {

    private val db: FirebaseDatabase by lazy {
        Firebase.database
    }
    val moshi = Moshi.Builder().build()

    suspend fun getSections(): List<Section> = listOf(
        Section.Home("Eliseo", "Juan Quintanilla", title = "Android Developer"),
        Section.Slogan("Lo rápido es decir que hago apps, lo cierto es que acerco personas a servicios, y de la manera más sencilla posible."),
        Section.Home("Eliseo", "Juan Quintanilla", title = "Android Developer")
    )

    /*moshi.adapter<FirebaseData>(FirebaseData::class.java)
        .let { jsonAdapter ->
            db.reference.getValue()
                .map { jsonAdapter.fromJson(it.toString()) }
                .flatMap { it?.sections ?: emptyList() }
                .map { it.toSection() }
    }*/
}