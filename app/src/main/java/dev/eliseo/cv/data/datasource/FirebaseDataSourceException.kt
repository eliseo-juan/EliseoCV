package dev.eliseo.cv.data.datasource

sealed class FirebaseDataSourceException(message: String) : Exception(message) {
    object OperationFailed : FirebaseDataSourceException("Firebase OperationF Failed")
}