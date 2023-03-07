package com.example.main.characters

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.core.base.BaseFragment
import com.example.main.databinding.FragmentCharactersBinding

class CharactersFragment(layoutId: Int) : BaseFragment<FragmentCharactersBinding, CharacterViewModel>(
    layoutId
) {

    override val binding: FragmentCharactersBinding by viewBinding(FragmentCharactersBinding::bind)
    override val viewModel: CharacterViewModel by viewModels()
}