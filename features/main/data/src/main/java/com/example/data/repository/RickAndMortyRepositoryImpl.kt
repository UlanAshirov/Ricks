package com.example.data.repository

import androidx.paging.PagingData
import com.example.data.remote.apiservice.ApiService
import com.example.domain.model.EpisodeModel
import com.example.domain.model.LocationModel
import com.example.domain.model.ResultModel
import com.example.domain.repository.RickAndMortyRepository
import kotlinx.coroutines.flow.Flow

class RickAndMortyRepositoryImpl(private val apiService: ApiService) : RickAndMortyRepository {

    override fun getCharacter(
        name: String,
        status: String,
        gender: String,
        species: String
    ): Flow<PagingData<ResultModel>> {
        TODO("Not yet implemented")
    }

    override fun getLocation(name: String): Flow<PagingData<LocationModel>> {
        TODO("Not yet implemented")
    }

    override fun getEpisode(name: String): Flow<PagingData<EpisodeModel>> {
        TODO("Not yet implemented")
    }
}