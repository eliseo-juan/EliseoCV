package dev.eliseo.cv.view.slogan

import androidx.lifecycle.viewModelScope
import dev.eliseo.cv.domain.repository.SectionRepository
import dev.eliseo.lib_base.view.BaseViewModel
import kotlinx.coroutines.launch

class SloganViewModel(
    private val sectionRepository: SectionRepository
): BaseViewModel<SloganViewModel.ViewState, Nothing>() {

    init {
        viewModelScope.launch {
            val slogan = sectionRepository.getSlogan().sloganText
            updateViewState { ViewState(slogan) }
        }
    }

    data class ViewState(val slogan: String)
}