package com.example.ui

import com.example.enum.TypeCar
import com.example.listener.Car
import com.example.listener.CarFactory
import kotlin.properties.Delegates

class PassengerFactory: CarFactory {

    override fun createCar(
        brand: String,
        model: String,
        carType: TypeCar,
        yearOfCar: Int,
        fuelType: String,
        volumeOfTank: Double,
        fuelConsumption: Double,
    ): Car {
        println("Passenger car created")
        return PassengerCar(
            brand,
            model,
            carType,
            yearOfCar,
            fuelType,
            volumeOfTank,
            fuelConsumption,
            passengerCapacity,
            fare)
    }
}