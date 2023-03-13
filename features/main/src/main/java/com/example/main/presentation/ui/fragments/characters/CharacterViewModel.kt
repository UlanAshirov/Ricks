package com.example.main.presentation.ui.fragments.characters

import com.example.core.base.BaseViewModel
import com.example.domain.usecase.GetCharacterUseCase
import com.example.main.presentation.model.toUI

class CharacterViewModel(
    private val getCharacterUseCase: GetCharacterUseCase
) : BaseViewModel() {

    fun getCharacters(
        name: String? = null,
        status: String? = null,
        gender: String? = null,
        species: String? = null
    ) =
        getCharacterUseCase(
            name = name,
            status = status,
            gender = gender,
            species = species
        ).gatherPagingRequest {
            it.toUI()
        }
}