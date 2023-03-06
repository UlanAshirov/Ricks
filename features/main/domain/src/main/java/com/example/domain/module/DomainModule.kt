package com.example.domain.module

import com.example.domain.usecase.GetCharacterUseCase
import com.example.domain.usecase.GetEpisodeLocation
import com.example.domain.usecase.GetLocationUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetCharacterUseCase(get()) }
    factory { GetLocationUseCase(get()) }
    factory { GetEpisodeLocation(get()) }
}