package com.herehearteam.herehear.domain.model

data class Article(
    val id: String,
    val title: String,
    val tag: String,
    val date: String,
    val description: String,
    val source: String,
    val imageRes: Int,
    val url: String
)