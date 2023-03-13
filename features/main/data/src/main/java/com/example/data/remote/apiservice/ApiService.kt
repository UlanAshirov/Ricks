package com.example.data.remote.apiservice

import com.example.data.base.BaseMainResponse
import com.example.data.remote.dtos.EpisodeDto
import com.example.data.remote.dtos.LocationDto
import com.example.data.remote.dtos.ResultDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("api/character")
    suspend fun getCharacter(
        @Query("name") name: String? = "",
        @Query("status") status: String? = "",
        @Query("gender") gender: String? = "",
        @Query("species") species: String? = "",
        @Query("page") page: Int
    ): BaseMainResponse<ResultDto>

    @GET("api/location")
    suspend fun getLocation(
        @Query("name") name: String? = "",
        @Query("page") page: Int,
    ): BaseMainResponse<LocationDto>

    @GET("api/episodes")
    suspend fun getEpisodes(
        @Query("name") name: String? = "",
        @Query("page") page: Int
    ): BaseMainResponse<EpisodeDto>


    @GET("api/characters/{id}")
    suspend fun getCharacterDetails(
        @Path("id") id: Int
    ): ResultDto
}