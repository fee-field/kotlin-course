package com.feefield.kotlincourse.lesson017.homework

open class GeometricFigure(
    val angleCount: Int,
    val name: String,
    val color: String,
) {
    fun printInfo() {
        println("У вашего $name $color цвета ${angleCount} углов(-а).")
    }
}

open class Polygon(
    angleCount: Int,
    name: String,
    color: String,
//    sideCount: Int,
    val sideCount: Int,
) : GeometricFigure(angleCount, name, color) {
    fun checkSides() : Boolean = sideCount > 0
}

class Circle(
    name: String,
    color: String,
    val diameter: Int,
) : GeometricFigure(0, name, color) {

    fun checkDiameter() : Boolean = diameter > 0

    }

class Triangle (
    angleCount: Int,
    name: String,
    color: String,
    sideCount: Int,
    val isAcute: Boolean = true,
) : Polygon(angleCount, name, color, sideCount) {

    fun checkAngle()  = println(isAcute.toString())
}

class Quadrilateral (
    angleCount: Int,
    name: String,
    color: String,
    sideCount: Int,
) : Polygon(angleCount, name, color, sideCount) {

}
