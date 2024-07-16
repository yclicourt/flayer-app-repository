package com.yoadev.flayerprojectapp.ui.home

import androidx.lifecycle.ViewModel
import com.yoadev.flayerprojectapp.domain.model.EventInfo
import com.yoadev.flayerprojectapp.domain.model.EventInfo.*

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {


    /**
     * Configuracion del StateFlow para manejar la interaccion entre la vista y el ViewModel
     */
    private var _home = MutableStateFlow<List<EventInfo>>(emptyList())
    val home: StateFlow<List<EventInfo>> = _home

    init {
        _home.value = listOf(
            Fiesta, Concierto, Electro, Rock
        )
    }


}