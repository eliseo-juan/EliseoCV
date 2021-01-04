package dev.eliseo.lib_base.view

import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.consumeEach

abstract class BaseViewModelActivity<B : ViewBinding, VS, VC, VM : BaseViewModel<VS, VC>> : AppCompatActivity() {

    abstract val viewBinding: (LayoutInflater) -> B
    protected lateinit var binding: B

    protected abstract val viewModel: VM

    @ExperimentalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = viewBinding(layoutInflater)
        setContentView(binding.root)

        viewModel.viewState.observe(this, Observer(this::renderViewState))

        lifecycleScope.launchWhenCreated {
            viewModel.viewChannel.consumeEach(this@BaseViewModelActivity::handleViewChannel)
        }

        setupUI()
    }
    protected abstract fun setupUI()

    protected abstract fun renderViewState(viewState: VS)
    protected abstract fun handleViewChannel(viewChannel: VC)

}