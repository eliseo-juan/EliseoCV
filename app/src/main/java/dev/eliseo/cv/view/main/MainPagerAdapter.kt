package dev.eliseo.cv.view.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import dev.eliseo.cv.domain.model.Section
import dev.eliseo.cv.view.home.HomeFragment
import dev.eliseo.cv.view.slogan.SloganFragment

class MainPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val sections: MutableList<Section> = mutableListOf()

    override fun createFragment(position: Int): Fragment = when(sections[position]) {
        is Section.Home -> HomeFragment.newInstance()
        is Section.Slogan -> SloganFragment.newInstance()
        else -> HomeFragment.newInstance()
    }

    override fun getItemCount(): Int = sections.size

    fun setSections(sections: List<Section>) = this.sections.apply {
        clear()
        addAll(sections)
    }

    fun getTitle(position: Int): String {
        return when (this.sections[position]) {
             is Section.Home -> "Perfil más largo a ver"
            else -> "Otro"
        }
    }
}