package com.feefield.kotlincourse.lesson020.homework

class OvenNotAbstract : TemperatureRegulatableDevices(), Movable {

    override fun move(direction: String, distance: Int) {
        println("The oven can be moved to $distance for $distance meters.")
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