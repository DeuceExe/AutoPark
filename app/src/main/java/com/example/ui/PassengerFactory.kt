package com.example.ui

import com.example.listener.Car
import com.example.listener.CarFactory

class PassengerFactory: CarFactory {
    override fun createCar(): Car {
        println("Passenger car created")
        return PassengerCar()
    }
}