package com.example.ui

import com.example.listener.Car

class CargoCar(): Car {
    override fun fillCar() {
        println("Cargo car is filled")
        super.fillCar()
    }

    override fun repairCar() {
        println("Cargo car is repaired")
        super.repairCar()
    }

    override fun cleanCar() {
        println("Cargo car is cleaned")
        super.cleanCar()
    }
}