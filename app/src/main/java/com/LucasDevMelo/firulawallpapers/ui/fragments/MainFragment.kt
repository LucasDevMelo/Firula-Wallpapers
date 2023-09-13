package com.LucasDevMelo.firulawallpapers.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.LucasDevMelo.firulawallpapers.databinding.FragmentMainBinding
import com.LucasDevMelo.firulawallpapers.ui.fragments.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    private val tabTitles = listOf("Início", "Popular", "Aleatório", "Categorias")
    private val fragments = listOf(HomeFragment(), PopularFragment(), RandomFragment(), CategoriesFragment())

    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        initViewPager()
        initToolBar()
        return binding.root
    }

    private fun initViewPager() {
        val pagerAdapter = ViewPagerAdapter(context as FragmentActivity, fragments)
        binding.viewPager.adapter = pagerAdapter
        binding.viewPager.isUserInputEnabled = false

        // Agora, após definir o adaptador, você pode configurar o TabLayoutMediator.
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }

    private fun initToolBar(){
        binding.toolbar.title = "Wallpapers"
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
    }
}