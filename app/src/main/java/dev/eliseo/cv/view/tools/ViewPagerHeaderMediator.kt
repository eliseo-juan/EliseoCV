package dev.eliseo.cv.view.tools

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import dev.eliseo.cv.R
import dev.eliseo.cv.view.main.HeaderViewHolder

class ViewPagerHeaderMediator(
    private val content: ViewPager2,
    private val header: RecyclerView,
    private val headerConfigurationStrategy: (headerViewHolder: HeaderViewHolder, position: Int) -> Unit
) {

    private val viewPagerChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            header.smoothScrollToPosition(position)
        }
    }

    private val headerAdapter = object : RecyclerView.Adapter<HeaderViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_header, parent, false)
                .run { HeaderViewHolder(this) }

        override fun getItemCount(): Int = content.adapter?.itemCount ?: 0

        override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
            headerConfigurationStrategy.invoke(holder, position)
            holder.itemView.setOnClickListener {
                content.currentItem = holder.adapterPosition
            }
        }
    }

    fun attach() {
        header.adapter = headerAdapter
        content.registerOnPageChangeCallback(viewPagerChangeCallback)
    }

    fun dettach() {
        content.unregisterOnPageChangeCallback(viewPagerChangeCallback)
    }
}