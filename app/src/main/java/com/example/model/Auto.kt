package com.example.model

import com.example.enum.TypeCar

data class Auto(
    val brand: String,
    val model: String,
    val carType: TypeCar,
    val yearOfCar: Int,
    val fuelType: String,
    val fuelConsumption: Double)
