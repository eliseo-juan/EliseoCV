package dev.eliseo.lib_base.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel

abstract class BaseViewModel<VS, VE> : ViewModel() {

    private val _viewState = MutableLiveData<VS>()
    val viewState: LiveData<VS>
        get() = _viewState

    private val _viewChannel = Channel<VE>()
    val viewChannel: ReceiveChannel<VE>
        get() = _viewChannel

    protected fun updateViewState(update: VS?.() -> VS) {
        val newState = update(_viewState.value)
        _viewState.value = newState
    }

    protected suspend fun sendViewEvent(viewEvent: VE) {
        _viewChannel.send(viewEvent)
    }
}