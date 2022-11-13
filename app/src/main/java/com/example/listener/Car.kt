package com.example.listener

import com.example.enum.TypeCar
import com.example.ui.CargoFactory
import com.example.ui.CargoPassengerFactory
import com.example.ui.PassengerFactory

interface Car {
    val brand: String
    val model: String
    val carType: TypeCar
    val yearOfCar: Int
    val fuelType: String
    val volumeOfTank: Double
    val fuelConsumption: Double

    fun fillCar(){}

    fun repairCar(){}

    fun cleanCar(){}

    companion object {
        fun createSpecialtyCar(typeCar: TypeCar): CarFactory {
            return if (typeCar.toString().equals(TypeCar.Passenger.toString(), ignoreCase = true)) {
                PassengerFactory()
            } else if (typeCar.toString().equals(TypeCar.Cargo.toString(), ignoreCase = true)) {
                CargoFactory()
            } else {
                CargoPassengerFactory()
            }
        }
    }
}