package com.feefield.kotlincourse.lesson020

import com.feefield.kotlincourse.lesson020.homework.FridgeNotAbstract
import com.feefield.kotlincourse.lesson020.homework.KettleNotAbstract
import com.feefield.kotlincourse.lesson020.homework.OvenNotAbstract
import com.feefield.kotlincourse.lesson020.homework.WashingMachineNotAbstract

fun main() {

    val fridge = FridgeNotAbstract()
    fridge.powerOn()
    fridge.emitLight()
    fridge.setTemperature(50)

    val kettle = KettleNotAbstract()
    kettle.programAction("boil water")
    kettle.getWater(500)

    val washingMachine = WashingMachineNotAbstract()
    washingMachine.powerOn()
    washingMachine.drain()
    washingMachine.connectToWaterSupply()

    val oven = OvenNotAbstract()
    oven.move("there", 800)
    oven.powerOn()



}