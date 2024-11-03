package com.feefield.kotlincourse.lesson018.homework

fun main() {

//Animals

    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }

//Shapes

    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, 5.0)
    )
//    val area1 = shapes.area()
    shapes.forEach { shape ->
        println("Площадь фигуры: ${shape.area()}")
    }

//Prints

    val textToPrint = "When I'm drivin' in my car\n" +
            "And the man comes on the radio\n" +
            "He's tellin' me more and more\n" +
            "About some useless information\n" +
            "Supposed to drive my imagination"

    val laserPrint = LaserPrinter()
    laserPrint.print(textToPrint)

//Cart

    val cart2 = Cart()
    cart2.addToCart(1)
    cart2.addToCart(2, 4)
    cart2.addToCart(listOf(12, 13, 14))
    cart2.addToCart(mapOf(15 to 3, 16 to 4))
    println(cart2)

//Logger

    val log = Logger()
    log.log("WARNING")
    log.log("ERROR", "This is an error message")

    val messages = listOf(
        "This is the error message",
        "This is the warning",
        "This is the exception"
    )
    log.log(messages)


}
