package com.feefield.kotlincourse.lesson020.homework

import java.io.InputStream

abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable, LightEmitting {
    override fun powerOn() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override fun setVolume(volume: Int) {
        TODO("Not yet implemented")
    }

    override fun mute() {
        TODO("Not yet implemented")
    }

    override fun playSound(stream: InputStream) {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }

    override fun emitLight() {
        TODO("Not yet implemented")
    }

    override fun completeLiteEmission() {
        TODO("Not yet implemented")
    }
}