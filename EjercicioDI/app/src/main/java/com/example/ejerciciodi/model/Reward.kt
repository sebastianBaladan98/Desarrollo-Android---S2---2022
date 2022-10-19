package com.example.ejerciciodi.model

data class Reward(
    val conditions: List<Condition>,
    val id: Int,
    val item: Item
)