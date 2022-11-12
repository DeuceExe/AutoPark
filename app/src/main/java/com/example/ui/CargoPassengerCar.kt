package com.example.ui

import com.example.listener.Car

class CargoPassengerCar: Car {
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
}