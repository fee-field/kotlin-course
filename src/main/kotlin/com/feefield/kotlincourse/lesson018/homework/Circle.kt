package com.feefield.kotlincourse.lesson018.homework

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}