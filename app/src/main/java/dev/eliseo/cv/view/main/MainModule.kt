package dev.eliseo.cv.view.main

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {

    scope<MainActivity> {
        viewModel {
            MainViewModel(get())
        }
    }

}