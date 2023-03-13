package com.example.data.repository

import com.example.data.base.makeNetworkRequest
import com.example.data.base.makePagingRequest
import com.example.data.remote.apiservice.ApiService
import com.example.data.remote.source.CharactersSource
import com.example.data.remote.source.EpisodeSource
import com.example.data.remote.source.LocationSource
import com.example.domain.repository.RickAndMortyRepository

class RickAndMortyRepositoryImpl(private val apiService: ApiService) : RickAndMortyRepository {

    override fun getCharacter(
        name: String?,
        status: String?,
        gender: String?,
        species: String?
    ) = makePagingRequest(
        CharactersSource(
            apiService = apiService,
            name = name,
            status = status,
            gender = gender,
            species = species
        )
    )

    override fun getLocation(name: String) = makePagingRequest(
        LocationSource(
            apiService = apiService,
            name = name
        )
    )

    override fun getEpisode(name: String) = makePagingRequest(
        EpisodeSource(
            apiService = apiService,
            name = name
        )
    )

    override fun getDetailCharacter(id: Int) = makeNetworkRequest {
        apiService.getCharacterDetails(id).toDomain()
    }
}