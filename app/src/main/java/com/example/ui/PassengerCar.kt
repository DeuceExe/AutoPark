package com.example.ui

import com.example.listener.Car

class PassengerCar(): Car {
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

}