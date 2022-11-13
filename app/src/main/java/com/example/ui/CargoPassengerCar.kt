package com.example.ui

import com.example.enum.BodyCar
import com.example.enum.TypeCar
import com.example.listener.Car

class CargoPassengerCar(
    override val brand: String,
    override val model: String,
    override val carType: TypeCar,
    override val yearOfCar: Int,
    override val fuelType: String,
    override val volumeOfTank: Double,
    override val fuelConsumption: Double,
    val bodyType: BodyCar,
    val passengerCapacity: Int,
    val bodyVolume: Double,
    val loadCapacity: Double
) : Car {

    override fun fillCar() {
        println("Cargo-passenger car is filled")
        super.fillCar()
    }

    override fun repairCar() {
        println("Cargo-passenger car is repaired")
        super.repairCar()
    }

    override fun cleanCar() {
        println("Cargo-passenger car is cleaned")
        super.cleanCar()
    }

    fun dismantleSeatsForCargo(){
        println("Passenger seats dismantled for cargo")
    }
}