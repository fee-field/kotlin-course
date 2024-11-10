package com.feefield.kotlincourse.lesson020.homework

import java.io.InputStream

//Создай не абстрактные классы устройств с наследованием от абстрактного класса с
// возможностью устанавливать температуру и открываться. Пусть это будет холодильник,
// стиральная машина, чайник, духовка. Добавь недостающие интерфейсы и реализуй необходимые
// методы (достаточно вывод в консоль производимого действия). Обрати внимание на то,
// что установка температуры и программирование устройства (считай - задание режима работы)
// не имеет смысла при выключенном питании - добавь эту проверку.

class FridgeNotAbstract : TemperatureRegulatableDevices(), LightEmitting, SoundEmitting {

    override fun emitLight() {
        println("Light is emitted.")
    }

    override fun completeLiteEmission() {
        println("Emission is completed.")
    }

    override fun setVolume(volume: Int) {
        println("Volume is set.")
    }

    override fun mute() {
        println("Device is muted.")
    }

    override fun playSound(stream: InputStream) {
        println("Device is playing the sound.")
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