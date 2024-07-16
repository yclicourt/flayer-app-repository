package com.yoadev.flayerprojectapp.data.providers

import com.yoadev.flayerprojectapp.domain.model.EventInfo
import com.yoadev.flayerprojectapp.domain.model.EventInfo.*
import javax.inject.Inject


class HomeProvider @Inject constructor(){

    fun getEvents():List<EventInfo>{

        return listOf(
            Fiesta,
            Concierto,
            Electro,
            Rock
        )
    }

}