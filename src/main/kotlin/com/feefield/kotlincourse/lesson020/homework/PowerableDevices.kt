package com.feefield.kotlincourse.lesson020.homework


//Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий
// интерфейс с реализацией методов (достаточно println с выполняемым действием).

abstract class PowerableDevices : Powerable {
    var isOn = false

    override fun powerOn() {
        isOn = true
        println("Device is Powered On")
    }

    override fun powerOff() {
        println("Device is Powered Off")
    }
}