package com.yoadev.flayerprojectapp.data.providers

import com.yoadev.flayerprojectapp.domain.model.ProjectInfo
import com.yoadev.flayerprojectapp.domain.model.ProjectInfo.*
import javax.inject.Inject

class ProjectProvider @Inject constructor() {

    fun getProjects(): List<ProjectInfo> {


        return listOf(
            Project_Bar_41,
            Project_Buenas_Vibras,
            Project_Candy,
            Project_Wow,
            Project_VIP
        )
    }
}