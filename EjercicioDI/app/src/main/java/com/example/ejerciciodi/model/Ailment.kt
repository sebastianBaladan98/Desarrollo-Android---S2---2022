package com.example.ejerciciodi.model

data class Ailment(
    val description: String,
    val id: Int,
    val name: String,
    val protection: Protection,
    val recovery: Recovery
)