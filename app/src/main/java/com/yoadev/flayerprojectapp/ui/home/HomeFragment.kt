package com.yoadev.flayerprojectapp.ui.home

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.yoadev.flayerprojectapp.databinding.FragmentHomeBinding
import com.yoadev.flayerprojectapp.ui.home.adapter.HomeAdapter
import com.yoadev.flayerprojectapp.ui.home.adapter.ProjectAdapter
import dagger.hilt.android.AndroidEntryPoint
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
        initListeners()
    }

    private fun initListeners() {
        binding.parentContainer.setOnClickListener {
            initAnimation()
            findNavController().navigate(
                HomeFragmentDirections.actionNavHomeToEventHomeDetailActivity()
            )

        }
    }


    private fun initAnimation() {
        binding.cvPoster.alpha = 0f
        val animator = ValueAnimator.ofFloat(0f, 1f)
        animator.duration = 5000
        animator.interpolator = BounceInterpolator()
        animator.addUpdateListener { valueAnimator ->
            val animatedValue = valueAnimator.animatedValue as Float
            binding.cvPoster.alpha = animatedValue
            binding.cvPoster.scaleX = animatedValue
            binding.cvPoster.scaleY = animatedValue

        }
        animator.start()
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