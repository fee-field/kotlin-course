package com.feefield.kotlincourse.lesson020.homework

//Создай абстрактный класс оборудования с возможностью устанавливать температуру и
// открываться и с наследованием от программируемого оборудования. Также имплементируй
// интерфейсы.

abstract class TemperatureRegulatableDevices : ProgrammableDevices(), TemperatureRegulatable, Openable {

    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }
}