package lesson017.homework

open class Furniture(
    val material: String,
    val weight: Double,
    val size: List<Int>,
) {

    fun printInfo() {
        println("It is made of $material, it's weight is $weight kg and the size is $size")

    }
}

open class Chair(
    material: String,
    weight: Double,
    size: List<Int>,
    val hasArmrests: Boolean,
) : Furniture(material, weight, size) {

    fun chairInfo() {
        println("Chair has armrests: $hasArmrests")
    }
}

open class Table(
    material: String,
    weight: Double,
    size: List<Int>,
    val shape: String,
) : Furniture(material, weight, size) {

    fun tableInfo() {
        println("Table shape is $shape")
    }
}

class OfficeChair(
    material: String,
    weight: Double,
    size: List<Int>,
    hasArmrests: Boolean,
    val hasWheels: Boolean,
) : Chair(material, weight, size, hasArmrests) {

    fun officeChairInfo() {
        println("Office chair has wheels: $hasWheels")
    }
}