package com.example.ui

import com.example.enum.TypeCar
import com.example.listener.Car.Companion.createSpecialtyCar


fun main(){
    val cargoFactory = createSpecialtyCar(TypeCar.Cargo)
    val passengerFactory = createSpecialtyCar(TypeCar.Passenger)
    val cargoPassengerFactory = createSpecialtyCar(TypeCar.CargoPassenger)

    val gazelle = cargoPassengerFactory.createCar()
    val bus = passengerFactory.createCar()
    val van = cargoFactory.createCar()

    gazelle.repairCar()
    bus.cleanCar()
    van.fillCar()
}

