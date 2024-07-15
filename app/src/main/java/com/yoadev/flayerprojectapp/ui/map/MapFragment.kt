package com.yoadev.flayerprojectapp.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yoadev.flayerprojectapp.R
import com.yoadev.flayerprojectapp.databinding.FragmentHomeBinding
import com.yoadev.flayerprojectapp.databinding.FragmentMapBinding


class MapFragment : Fragment() {

    private var _binding: FragmentMapBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}