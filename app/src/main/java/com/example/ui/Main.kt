package com.example.ui

import com.example.enum.Cargo
import com.example.enum.TypeCar
import com.example.listener.Car.Companion.createSpecialtyCar
import com.example.model.Order


fun main(){
    var userList: Array<Order> = arrayOf(Order(
        "Minsk", "Brest", 370.5, 10.5, 15.0,
        Cargo.ManufacturedGoods, 420.0),)

    val cargoFactory = createSpecialtyCar(TypeCar.Cargo)
    val passengerFactory = createSpecialtyCar(TypeCar.Passenger)
    val cargoPassengerFactory = createSpecialtyCar(TypeCar.CargoPassenger)

    val gazelle = cargoPassengerFactory.createCar()
    val bus = passengerFactory.createCar(
        "polo", "kek", TypeCar.CargoPassenger, 1999, "dizel",
        3.5, 2.0, 20, 0.9)
    val van = cargoFactory.createCar()

    gazelle.repairCar()
    bus.cleanCar()
    van.fillCar()
}