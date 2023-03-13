package com.example.main.presentation.ui.fragments.episodes

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.core.base.BaseFragment
import com.example.main.R
import com.example.main.databinding.FragmentEpisodesBinding

class EpisodesFragment :
    BaseFragment<FragmentEpisodesBinding, EpisodesViewModel>(R.layout.fragment_episodes) {

    override val binding: FragmentEpisodesBinding by viewBinding(FragmentEpisodesBinding::bind)
    override val viewModel: EpisodesViewModel by viewModels()
}