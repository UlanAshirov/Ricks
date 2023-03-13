package com.example.main.presentation.model

import com.example.domain.model.ResultModel

data class ResultUI(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationUI,
    val name: String,
    val origin: OriginUI,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

fun ResultModel.toUI() = ResultUI(
    created = created,
    episode = episode,
    gender = gender,
    id = id,
    image = image,
    location = location.toUI(),
    name = name,
    origin = origin.toUI(),
    species = species,
    status = status,
    type = type,
    url = url
)