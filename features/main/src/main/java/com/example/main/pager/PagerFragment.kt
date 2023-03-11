package com.example.main.pager

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.core.base.BaseFragment
import com.example.main.R
import com.example.main.databinding.FragmentPagerBinding
import com.google.android.material.tabs.TabLayoutMediator

class PagerFragment: BaseFragment<FragmentPagerBinding, PagerViewModel>(R.layout.fragment_pager) {

    override val binding: FragmentPagerBinding by viewBinding(FragmentPagerBinding::bind)
    override val viewModel: PagerViewModel by viewModels()
    private val tabTitles = arrayListOf("Characters", "Episodes", "Location")

    override fun initialize() {
        pagerInit()
    }

    private fun pagerInit() {
        binding.viewPager.adapter = PagersAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }

}