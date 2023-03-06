package com.example.domain.repository

import androidx.paging.PagingData
import com.example.domain.model.LocationModel
import com.example.domain.model.ResultModel
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {
    fun getCharacter(
        name: String,
        status: String,
        gender: String,
        species: String
    ): Flow<PagingData<ResultModel>>

    fun getLocation(name: String): Flow<PagingData<LocationModel>>
}