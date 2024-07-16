package com.yoadev.flayerprojectapp.domain.model

import com.yoadev.flayerprojectapp.R

sealed class ProjectInfo (val img:Int) {

    data object Project_Bar_41:ProjectInfo(R.drawable.project_bar_41)
    data object Project_Buenas_Vibras:ProjectInfo(R.drawable.project_buenas_vibras)
    data object Project_Candy:ProjectInfo(R.drawable.project_candy)
    data object Project_Wow:ProjectInfo(R.drawable.project_wow)
    data object Project_VIP:ProjectInfo(R.drawable.project_vip)
}