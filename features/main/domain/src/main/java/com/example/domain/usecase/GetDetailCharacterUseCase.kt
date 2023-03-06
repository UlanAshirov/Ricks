package com.example.domain.usecase

import com.example.domain.repository.RickAndMortyRepository

class GetDetailCharacterUseCase(private val repository: RickAndMortyRepository) {
    operator fun invoke(id: Int) = repository.getDetailCharacter(id = id)
}