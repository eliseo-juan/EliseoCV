package dev.eliseo.lib_base.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel

abstract class BaseViewModel<VS, VC> : ViewModel() {

    protected val _viewState = MutableLiveData<VS>()
    val viewState: LiveData<VS>
        get() = _viewState

    protected val _viewChannel = Channel<VC>()
    val viewChannel: ReceiveChannel<VC>
        get() = _viewChannel
}