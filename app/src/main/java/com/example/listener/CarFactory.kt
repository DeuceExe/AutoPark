package com.example.listener

import com.example.enum.TypeCar

interface CarFactory{
    fun createCar(
        brand: String,
        model: String,
        carType: TypeCar,
        yearOfCar: Int,
        fuelType: String,
        volumeOfTank: Double,
        fuelConsumption: Double): Car
}