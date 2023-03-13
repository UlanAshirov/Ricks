package com.example.main.presentation.ui.fragments.characters

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.core.base.BaseFragment
import com.example.main.R
import com.example.main.databinding.FragmentCharactersBinding
import com.example.main.presentation.ui.adapters.CharacterPagingAdapter
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class CharactersFragment :
    BaseFragment<FragmentCharactersBinding, CharacterViewModel>(R.layout.fragment_characters) {

    override val binding: FragmentCharactersBinding by viewBinding(FragmentCharactersBinding::bind)
    override val viewModel: CharacterViewModel by viewModels()
    private val adapter: CharacterPagingAdapter by lazy { CharacterPagingAdapter() }

    override fun initialize() {
     binding.rvCharacters.adapter = adapter
    }

    override fun establishRequest() {
        viewModel.getCharacters().spectatePaging { data ->
            adapter.submitData(data)
        }
    }
}