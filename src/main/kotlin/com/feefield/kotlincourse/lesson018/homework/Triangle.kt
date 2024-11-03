package com.feefield.kotlincourse.lesson018.homework

class Triangle(val sideA: Double, val sideB: Double, val angle: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * sideA * sideB * angle
    }
}