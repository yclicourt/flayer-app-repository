package com.yoadev.flayerprojectapp.ui.home.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.yoadev.flayerprojectapp.databinding.ItemHomeBinding
import com.yoadev.flayerprojectapp.domain.model.EventInfo


class HomeViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHomeBinding.bind(view)

    fun render(eventInfo: EventInfo){

        val context = binding.tvHomeEvent.context

        binding.tvHomeEvent.text = context.getString(eventInfo.title)
    }
}