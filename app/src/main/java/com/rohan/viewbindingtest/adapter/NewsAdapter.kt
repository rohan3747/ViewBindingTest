package com.rohan.viewbindingtest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rohan.viewbindingtest.databinding.ItemLargeNewsBinding
import com.rohan.viewbindingtest.model.LargeNews

class NewsAdapter(
    private val largeNewsList: List<LargeNews>
) : RecyclerView.Adapter<NewsAdapter.LargeNewsViewHolder2>() {

    class LargeNewsViewHolder2(
        private val binding: ItemLargeNewsBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(largeNews: LargeNews) {
            binding.largeNews = largeNews
        }
    }

    private lateinit var binding: ItemLargeNewsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LargeNewsViewHolder2 {
        binding = ItemLargeNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LargeNewsViewHolder2(binding)
    }

    override fun onBindViewHolder(holder: LargeNewsViewHolder2, position: Int) {
        val largeNews = largeNewsList[position]
        holder.bind(largeNews)
    }

    override fun getItemCount(): Int = largeNewsList.size

}

