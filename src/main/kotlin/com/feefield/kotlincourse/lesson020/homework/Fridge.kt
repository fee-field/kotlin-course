package com.feefield.kotlincourse.lesson020.homework

import java.io.InputStream
import javax.sql.rowset.FilteredRowSet

abstract class Fridge : Powerable, Openable, TemperatureRegulatable, Drainable, LightEmitting, SoundEmitting  {

}

class ChildFridge(override val maxTemperature: Int) : Fridge() {
    override fun powerOn() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override fun connectToDrain() {
        TODO("Not yet implemented")
    }

    override fun drain() {
        TODO("Not yet implemented")
    }

    override fun emitLight() {
        TODO("Not yet implemented")
    }

    override fun completeLiteEmission() {
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

}