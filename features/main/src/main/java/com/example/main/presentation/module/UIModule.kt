package com.example.main.presentation.module

import com.example.main.presentation.ui.fragments.characters.CharacterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { CharacterViewModel(get()) }

}