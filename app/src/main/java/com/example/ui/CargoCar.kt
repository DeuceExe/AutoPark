package com.example.ui

import com.example.enum.BodyCar
import com.example.enum.TypeCar
import com.example.listener.Car

class CargoCar(
    override val brand: String,
    override val model: String,
    override val carType: TypeCar,
    override val yearOfCar: Int,
    override val fuelType: String,
    override val volumeOfTank: Double,
    override val fuelConsumption: Double,
    val bodyType: BodyCar,
    val bodyVolume: Double,
    val loadCapacity: Double
): Car {

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

    fun sealBody(){
        println("Body is sealed")
    }

    fun deliverGoods(startPoint: String, endPoint: String){
        println("A request for the delivery of goods has been left from $startPoint to $endPoint")
    }

}