package com.yoadev.flayerprojectapp.ui.home.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.yoadev.flayerprojectapp.databinding.ItemProjectBinding
import com.yoadev.flayerprojectapp.domain.model.ProjectInfo
import javax.inject.Inject

class ProjectViewHolder(view: View):RecyclerView.ViewHolder(view) {


    private val binding = ItemProjectBinding.bind(view)

    fun render(projectInfo: ProjectInfo){
        binding.ivProject.setImageResource(projectInfo.img)

    }
}