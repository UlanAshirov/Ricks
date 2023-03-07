package com.example.main.episodes

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.core.base.BaseFragment
import com.example.main.databinding.FragmentEpisodesBinding

class EpisodesFragment(layoutId: Int) : BaseFragment<FragmentEpisodesBinding, EpisodesViewModel>(
    layoutId
) {

    override val binding: FragmentEpisodesBinding by viewBinding(FragmentEpisodesBinding::bind)
    override val viewModel: EpisodesViewModel by viewModels()
}