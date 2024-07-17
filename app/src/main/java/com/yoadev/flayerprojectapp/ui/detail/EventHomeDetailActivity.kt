package com.yoadev.flayerprojectapp.ui.detail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.viewModels
import com.yoadev.flayerprojectapp.R
import com.yoadev.flayerprojectapp.databinding.ActivityEventHomeDetailBinding
import com.yoadev.flayerprojectapp.ui.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EventHomeDetailActivity : AppCompatActivity() {

    private lateinit var binding:ActivityEventHomeDetailBinding
    private val eventHomeDetailViewModel:EventHomeDetailViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityEventHomeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}