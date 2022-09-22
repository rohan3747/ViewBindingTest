package com.rohan.viewbindingtest.adapter

import androidx.recyclerview.widget.RecyclerView
import com.rohan.viewbindingtest.databinding.ItemLargeNewsBinding
import com.rohan.viewbindingtest.model.LargeNews

class LargeNewsViewHolder(
    private val binding: ItemLargeNewsBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(largeNews: LargeNews) {
        binding.largeNews = largeNews
    }
}