package dev.eliseo.cv.view.main

import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import dev.eliseo.cv.R
import dev.eliseo.cv.view.tools.ViewPagerHeaderMediator
import dev.eliseo.lib_base.view.BaseViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.scope.viewModel
import org.koin.androidx.scope.lifecycleScope as koinScope

class MainActivity : BaseViewModelActivity<MainViewState, MainViewChannel, MainViewModel>() {

    override val layoutResId: Int = R.layout.activity_main
    override val viewModel: MainViewModel by koinScope.viewModel(this)

    private val pagerAdapter: MainPagerAdapter by lazy {
        MainPagerAdapter(supportFragmentManager, lifecycle = lifecycle)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        viewPager2MainContainer.adapter = pagerAdapter
        ViewPagerHeaderMediator(
            content = viewPager2MainContainer,
            header = recyclerViewMainHeader
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
