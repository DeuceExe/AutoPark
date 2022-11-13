package com.example.ui

import com.example.enum.TypeCar
import com.example.listener.Car

class PassengerCar(
    override val brand: String,
    override val model: String,
    override val carType: TypeCar,
    override val yearOfCar: Int,
    override val fuelType: String,
    override val volumeOfTank: Double,
    override val fuelConsumption: Double,
    val passengerCapacity: Int,
    var fare: Double
): Car {

    override fun fillCar() {
        println("Passenger car is filled")
        super.fillCar()
    }

    override fun repairCar() {
        println("Passenger car is repaired")
        super.repairCar()
    }

    override fun cleanCar() {
        println("Passenger car is cleaned")
        super.cleanCar()
    }

    fun transportationPeople(startPoint: String, endPoint: String){
        println("Transportation of people from $startPoint to $endPoint")
    }

    fun disinfectSalon(){
        println("Salon disinfected")
    }



}