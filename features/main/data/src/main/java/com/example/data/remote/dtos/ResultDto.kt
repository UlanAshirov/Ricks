package com.example.data.remote.dtos

import com.example.data.utils.DataMapper
import com.example.domain.model.ResultModel

data class ResultDto(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationDto,
    val name: String,
    val origin: OriginDto,
    val species: String,
    val status: String,
    val type: String,
    val url: String
) : DataMapper<ResultModel> {
    override fun toDomain() = ResultModel(
        created = created,
        episode = episode,
        gender = gender,
        id = id,
        image = image,
        location = location.toDomain(),
        name = name,
        origin = origin.toDomain(),
        species = species,
        status = status,
        type = type,
        url = url
    )
}