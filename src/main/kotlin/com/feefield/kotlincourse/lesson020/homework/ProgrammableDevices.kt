package com.feefield.kotlincourse.lesson020.homework

//Создай абстрактный класс для программируемого оборудования (с имплементацией
// соответствующего интерфейса и реализацией методов) и наследуй его от абстрактного
// класса включаемого оборудования.

abstract class ProgrammableDevices : PowerableDevices(), Programmable {
    var requestedAction = ""

    override fun programAction(action: String) {
        requestedAction = action
        println("Your device has requested $requestedAction")
    }

    override fun execute() {
        println("Your device is currently doing $requestedAction")
    }
}