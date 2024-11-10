package com.feefield.kotlincourse.lesson020.homework

class KettleNotAbstract : TemperatureRegulatableDevices(), WaterContainer, AutomaticShutdown {
    override val capacity: Int = 0

    override fun fillWater(amount: Int) {
        println("Water filling process has started.")
    }

    override fun getWater(amount: Int) {
        println("Water getting process has started.")
    }

    override val sensorType: String = "type of sensor"
    override val maxSensoredValue: Int = 5

    override fun startMonitoring() {
        println("Monitoring has started.")
    }
}