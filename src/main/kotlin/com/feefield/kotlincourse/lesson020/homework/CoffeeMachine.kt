package com.feefield.kotlincourse.lesson020.homework

abstract class CoffeeMachine : Powerable, WaterConnection, TemperatureRegulatable, WaterContainer, Drainable, Programmable {
    override fun powerOn() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override fun connectToWaterSupply() {
        TODO("Not yet implemented")
    }


    override fun getWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override val capacity: Int
        get() = TODO("Not yet implemented")

    override fun fillWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun connectToDrain() {
        TODO("Not yet implemented")
    }

    override fun drain() {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }
}