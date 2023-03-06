package com.example.data.remote.dtos

import com.example.data.utils.DataMapper
import com.example.domain.model.LocationModel

data class LocationDto(
    val name: String,
    val url: String
) : DataMapper<LocationModel> {
    override fun toDomain() = LocationModel(
        name = name,
        url = url
    )
}