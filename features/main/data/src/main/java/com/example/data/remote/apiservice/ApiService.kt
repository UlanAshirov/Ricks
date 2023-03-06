package com.example.data.remote.apiservice

import com.example.data.base.BaseMainResponse
import com.example.data.remote.dtos.Info
import com.example.data.remote.dtos.LocationDto
import com.example.data.remote.dtos.ResultDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("character")
    suspend fun getCharacter(
        @Query("name") name: String? = "",
        @Query("status") status: String? = "",
        @Query("gender") gender: String? = "",
        @Query("species") species: String? = "",
        @Query("page") page: Int
    ): BaseMainResponse<ResultDto>

    @GET("location")
    suspend fun getLocation(
        @Query("name") name: String? = "",
        @Query("page") page: Int,
    ): BaseMainResponse<LocationDto>

    @GET("episodes")
    suspend fun getEpisodes(
        @Query("name") name: String? = "",
        @Query("page") pager: Int
    ): BaseMainResponse<Info>


    @GET("characters/&key")
    suspend fun getCharacterDetails(
        @Query("key") key: String
    ): BaseMainResponse<ResultDto>
}