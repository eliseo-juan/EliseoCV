package dev.eliseo.cv.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import dev.eliseo.cv.databinding.HomeFragmentBinding
import dev.eliseo.lib_base.view.BaseViewModelFragment
import org.koin.androidx.viewmodel.scope.viewModel
import org.koin.androidx.scope.lifecycleScope as koinScope

class HomeFragment : BaseViewModelFragment<HomeFragmentBinding, HomeViewModel.ViewState, HomeViewModel.ViewEvent, HomeViewModel>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override val viewBinding: (LayoutInflater, ViewGroup?) -> HomeFragmentBinding = { layoutInflater, viewGroup ->
        HomeFragmentBinding.inflate(layoutInflater, viewGroup, false)
    }

    override val viewModel: HomeViewModel by koinScope.viewModel(this)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

    override fun renderViewState(viewState: HomeViewModel.ViewState) {
        TODO("Not yet implemented")
    }

    override fun handleViewChannel(viewChannel: HomeViewModel.ViewEvent) {
        TODO("Not yet implemented")
    }
}