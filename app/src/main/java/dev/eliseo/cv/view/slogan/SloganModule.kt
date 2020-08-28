package dev.eliseo.cv.view.slogan

import dev.eliseo.cv.view.main.mainModule
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val sloganModule = module {

    scope<SloganFragment> {
        viewModel { SloganViewModel(get()) }
    }

}