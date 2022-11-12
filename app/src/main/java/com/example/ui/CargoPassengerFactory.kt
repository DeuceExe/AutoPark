package com.example.ui

import com.example.listener.Car
import com.example.listener.CarFactory

class CargoPassengerFactory: CarFactory {
    override fun createCar(): Car {
        println("Cargo-passenger car created")
        return CargoPassengerCar()
    }

}