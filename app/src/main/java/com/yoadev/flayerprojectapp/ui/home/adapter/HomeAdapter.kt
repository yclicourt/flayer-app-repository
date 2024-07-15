package com.yoadev.flayerprojectapp.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yoadev.flayerprojectapp.R
import com.yoadev.flayerprojectapp.domain.model.EventInfo

class HomeAdapter (private var eventList: List<EventInfo> = emptyList()) : RecyclerView.Adapter<HomeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home,parent,false))
    }

    override fun getItemCount(): Int {
        return eventList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
    holder.render(eventList[position])
    }
}