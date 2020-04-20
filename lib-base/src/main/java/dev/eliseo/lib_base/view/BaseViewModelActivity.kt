package dev.eliseo.lib_base.view

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.consumeEach

abstract class BaseViewModelActivity<VS, VC, VM : BaseViewModel<VS, VC>> : AppCompatActivity() {

    @get:LayoutRes
    protected abstract val layoutResId: Int

    protected abstract val viewModel: VM

    @ExperimentalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layoutResId)

        viewModel.viewState.observe(this, Observer(this::renderViewState))

        lifecycleScope.launchWhenCreated {
            viewModel.viewChannel.consumeEach(this@BaseViewModelActivity::handleViewChannel)
        }
    }

    protected abstract fun renderViewState(viewState: VS)
    protected abstract fun handleViewChannel(viewChannel: VC)

}