package dev.eliseo.cv.view.main

import androidx.lifecycle.viewModelScope
import dev.eliseo.cv.domain.repository.SectionRepository
import dev.eliseo.lib_base.view.BaseViewModel
import kotlinx.coroutines.launch

class MainViewModel(
    private val sectionRepository: SectionRepository
) : BaseViewModel<MainViewState, MainViewChannel>() {

    init {
        viewModelScope.launch {
            val sections = sectionRepository.getSections()
            updateViewState { MainViewState(sections) }
        }
    }
}