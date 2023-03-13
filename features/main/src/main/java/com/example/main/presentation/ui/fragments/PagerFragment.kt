package com.example.main.presentation.ui.fragments

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.core.base.BaseFragmentWithoutViewModel
import com.example.main.R
import com.example.main.databinding.FragmentPagerBinding
import com.example.main.presentation.ui.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class PagerFragment : BaseFragmentWithoutViewModel<FragmentPagerBinding>(R.layout.fragment_pager) {
    override val binding: FragmentPagerBinding by viewBinding(FragmentPagerBinding::bind)

    override fun initialize() {
        binding.pager.adapter = PagerAdapter(this)
        val fragmentsName = listOf(
            "Characters",
            "Episodes",
            "Location"
        )

        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, positiotn ->
            tab.text = fragmentsName[positiotn]
        }.attach()
    }

}