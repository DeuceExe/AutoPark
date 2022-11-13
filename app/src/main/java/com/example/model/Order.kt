package com.example.model

import com.example.enum.Cargo

data class Order(
    val startPoint: String,
    val endPoint: String,
    val distance: Double,
    val cargoVolume: Double,
    val cargoWeight: Double,
    val cargoType: Cargo,
    val price: Double
)
