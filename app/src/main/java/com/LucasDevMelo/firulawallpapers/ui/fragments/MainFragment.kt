package com.LucasDevMelo.firulawallpapers.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.LucasDevMelo.firulawallpapers.R
import com.LucasDevMelo.firulawallpapers.databinding.FragmentMainBinding

class MainFragment : Fragment() {


    private val tabTitles = listOf("Início", "Popular", "Aleatório", "Categorias")
    private val  fragment = listOf()

    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}