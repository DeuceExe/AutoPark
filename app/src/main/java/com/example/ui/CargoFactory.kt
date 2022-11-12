package com.example.ui

import com.example.listener.Car
import com.example.listener.CarFactory

class CargoFactory: CarFactory {
    override fun createCar(): Car {
        println("Cargo car created")
        return CargoCar()
    }
}