package com.example.main.presentation.model

import com.example.domain.model.LocationModel

data class LocationUI(
    val name: String,
    val url: String
)
fun LocationModel.toUI() = LocationUI(
    name = name,
    url = url
)