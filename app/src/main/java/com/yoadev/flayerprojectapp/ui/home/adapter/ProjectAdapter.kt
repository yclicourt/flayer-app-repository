package com.yoadev.flayerprojectapp.ui.home.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yoadev.flayerprojectapp.R
import com.yoadev.flayerprojectapp.domain.model.EventInfo
import com.yoadev.flayerprojectapp.domain.model.ProjectInfo

class ProjectAdapter(private var projectList:List<ProjectInfo> = emptyList()): RecyclerView.Adapter<ProjectViewHolder>(){


    fun updateList(list:List<ProjectInfo>){
        projectList = list
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {

        return ProjectViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_project,parent,false)
        )
    }

    override fun getItemCount() = projectList.size

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.render(projectList[position])
    }
}