package com.example.model

import com.example.enum.Cargo

data class Order(
    val startPoint: String,
    val endPoint: String,
    val distance: Double,
    val cargoVolume: String,
    val cargoWeight: Double,
    val cargoType: Cargo
)
