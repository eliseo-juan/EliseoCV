package dev.eliseo.cv.view.main

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.eliseo.cv.databinding.ViewHeaderBinding

class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ViewHeaderBinding.bind(view)


    val textViewHeader: TextView = binding.textViewHeader
}