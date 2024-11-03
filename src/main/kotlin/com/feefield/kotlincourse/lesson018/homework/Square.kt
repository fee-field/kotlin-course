package com.feefield.kotlincourse.lesson018.homework

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}