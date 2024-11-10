package com.feefield.kotlincourse.lesson020.homework

import java.io.InputStream

class WashingMachineNotAbstract : TemperatureRegulatableDevices(), Drainable,
    WaterConnection {

    override fun connectToDrain() {
        println("Connected to drain.")
    }

    override fun drain() {
        println("Draining is in progress.")
    }

    override fun connectToWaterSupply() {
        println("Connected to water supply.")
    }

    override fun getWater(amount: Int) {
        println("Started getting water.")
    }

    // переопределяю programAction с учётом isOn

    override fun programAction(action: String) {
        if (isOn) {
            requestedAction = action
            println("Your device has requested $requestedAction")
        }
    }

    // и для setTemperature
    var requestedTemp = 0
    override fun setTemperature(temp: Int) {
        if (isOn) {
            requestedTemp = temp
            println("Temperature is set as $requestedTemp")
        }
    }
}