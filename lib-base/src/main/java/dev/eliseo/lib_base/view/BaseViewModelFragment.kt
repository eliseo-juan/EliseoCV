package dev.eliseo.lib_base.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

abstract class BaseViewModelFragment<B : ViewBinding, VS, VC, VM : BaseViewModel<VS, VC>> : Fragment() {

    abstract val viewBinding: (LayoutInflater, ViewGroup?) -> B

    private var _binding: B? = null

    protected val binding: B get() = _binding!!

    protected abstract val viewModel: VM

    @FlowPreview
    @ExperimentalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.viewChannel.consumeAsFlow()
            .onEach { handleViewChannel(it) }
            .launchIn(lifecycleScope)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = viewBinding(inflater, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.viewState.observe(viewLifecycleOwner, { renderViewState(it) })
    }

    protected abstract fun renderViewState(viewState: VS)
    protected abstract fun handleViewChannel(viewChannel: VC)

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}