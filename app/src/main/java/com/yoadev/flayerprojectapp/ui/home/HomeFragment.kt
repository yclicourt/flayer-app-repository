package com.yoadev.flayerprojectapp.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.yoadev.flayerprojectapp.databinding.FragmentHomeBinding
import com.yoadev.flayerprojectapp.ui.home.adapter.HomeAdapter
import com.yoadev.flayerprojectapp.ui.home.adapter.ProjectAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HomeFragment : Fragment() {

    /**
     * Conexion del viewModel con el fragment mediante un delegado
     */
    private val homeViewModel by viewModels<HomeViewModel>()
    private lateinit var homeAdapter: HomeAdapter
    private lateinit var projectAdapter: ProjectAdapter

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }

    private fun initList() {
        /**
         * Inicializacion de un recyclerView Event
         */

        homeAdapter = HomeAdapter()

        binding.rvEvent.apply {
            layoutManager = GridLayoutManager(context, 4)
            adapter = homeAdapter
        }

        /**
         * Inicializacion de un recyclerView Project
         */
        projectAdapter = ProjectAdapter()

        binding.rvProject.apply {
            layoutManager = GridLayoutManager(context, 5)
            adapter = projectAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                homeViewModel.home.collect {
                    homeAdapter.updateList(it)
                }

            }
        }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                homeViewModel.project.collect {
                    projectAdapter.updateList(it)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}