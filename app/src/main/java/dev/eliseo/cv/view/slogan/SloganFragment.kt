package dev.eliseo.cv.view.slogan

import dev.eliseo.cv.R
import dev.eliseo.lib_base.view.BaseViewModelFragment
import kotlinx.android.synthetic.main.slogan_fragment.*
import org.koin.androidx.viewmodel.scope.viewModel
import org.koin.androidx.scope.lifecycleScope as koinScope

class SloganFragment : BaseViewModelFragment<SloganViewModel.ViewState, Nothing, SloganViewModel>() {

    companion object {
        fun newInstance() = SloganFragment()
    }

    override val layoutResId: Int = R.layout.slogan_fragment

    override val viewModel: SloganViewModel by koinScope.viewModel(this)

    override fun renderViewState(viewState: SloganViewModel.ViewState) {
        textViewSlogan.text = viewState.slogan
    }

    override fun handleViewChannel(viewChannel: Nothing) = Unit
}