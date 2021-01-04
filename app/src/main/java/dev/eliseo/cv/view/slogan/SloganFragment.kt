package dev.eliseo.cv.view.slogan

import android.view.LayoutInflater
import android.view.ViewGroup
import dev.eliseo.cv.databinding.SloganFragmentBinding
import dev.eliseo.lib_base.view.BaseViewModelFragment
import org.koin.androidx.viewmodel.scope.viewModel
import org.koin.androidx.scope.lifecycleScope as koinScope

class SloganFragment : BaseViewModelFragment<SloganFragmentBinding, SloganViewModel.ViewState, Nothing, SloganViewModel>() {

    companion object {
        fun newInstance() = SloganFragment()
    }

    override val viewBinding: (LayoutInflater, ViewGroup?) -> SloganFragmentBinding = { layoutInflater, viewGroup ->
        SloganFragmentBinding.inflate(layoutInflater, viewGroup, false)
    }

    override val viewModel: SloganViewModel by koinScope.viewModel(this)

    override fun renderViewState(viewState: SloganViewModel.ViewState) {
        binding.textViewSlogan.text = viewState.slogan
    }

    override fun handleViewChannel(viewChannel: Nothing) = Unit
}