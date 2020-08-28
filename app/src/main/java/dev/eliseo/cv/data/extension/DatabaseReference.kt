package dev.eliseo.cv.data.extension

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.getValue
import dev.eliseo.cv.data.datasource.FirebaseDataSourceException
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

suspend fun DatabaseReference.getValue(): String = suspendCancellableCoroutine { coroutine ->
    addListenerForSingleValueEvent(object : ValueEventListener {
        override fun onDataChange(snapshot: DataSnapshot) = coroutine.resume(snapshot.getValue<String>() as String )
        override fun onCancelled(error: DatabaseError) {
            coroutine.cancel(FirebaseDataSourceException.OperationFailed)
        }
    })
}
