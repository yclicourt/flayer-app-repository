package com.yoadev.flayerprojectapp.domain.model

import com.yoadev.flayerprojectapp.R

sealed class EventInfo(val title: Int) {

    data object Fiesta : EventInfo(R.string.party)
    data object Concierto : EventInfo(R.string.concert)
    data object Electro : EventInfo(R.string.electronic)
    data object Rock : EventInfo(R.string.rock)

}