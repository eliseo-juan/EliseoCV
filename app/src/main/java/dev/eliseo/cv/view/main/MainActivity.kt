package dev.eliseo.cv.view.main

import android.view.LayoutInflater
import dev.eliseo.cv.databinding.ActivityMainBinding
import dev.eliseo.cv.view.tools.ViewPagerHeaderMediator
import dev.eliseo.lib_base.view.BaseViewModelActivity
import org.koin.androidx.viewmodel.scope.viewModel
import org.koin.androidx.scope.lifecycleScope as koinScope

class MainActivity : BaseViewModelActivity<ActivityMainBinding, MainViewState, MainViewChannel, MainViewModel>() {

    override val viewBinding: (LayoutInflater) -> ActivityMainBinding = {
        ActivityMainBinding.inflate(it)
    }

    override val viewModel: MainViewModel by koinScope.viewModel(this)

    private val pagerAdapter: MainPagerAdapter by lazy {
        MainPagerAdapter(supportFragmentManager, lifecycle = lifecycle)
    }

    override fun setupUI() {
        binding.viewPager2MainContainer.adapter = pagerAdapter
        ViewPagerHeaderMediator(
            content = binding.viewPager2MainContainer,
            header = binding.recyclerViewMainHeader
        ) { headerViewHolder, position ->
            headerViewHolder.textViewHeader.text = pagerAdapter.getTitle(position)
        }.attach()
    }

    override fun renderViewState(viewState: MainViewState) {
        pagerAdapter.setSections(viewState.sections)
    }

    override fun handleViewChannel(viewChannel: MainViewChannel) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
