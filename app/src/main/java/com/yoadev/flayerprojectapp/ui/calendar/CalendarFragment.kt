package com.yoadev.flayerprojectapp.ui.calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.yoadev.flayerprojectapp.databinding.FragmentCalendarBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CalendarFragment : Fragment() {

    private var _binding: FragmentCalendarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCalendarBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

}