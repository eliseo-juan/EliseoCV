package dev.eliseo.cv

import android.app.Application
import dev.eliseo.cv.data.dataModules
import dev.eliseo.cv.view.presentationModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // declare used Android context
            androidContext(this@App)
            // declare modules
            modules(dataModules + presentationModules)
        }
    }
}