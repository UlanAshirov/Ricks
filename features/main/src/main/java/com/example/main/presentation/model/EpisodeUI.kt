package com.example.main.presentation.model

data class EpisodeUI(
    val name: String,
    val airDate: String,
    val episode: String,
    val characters: List<String>,
    val url: String,
    val created: String
)