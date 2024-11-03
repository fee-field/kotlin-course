package com.feefield.kotlincourse.lesson017.homework

fun main() {

    val polygon1 = Polygon(6,"шестиугольника","зеленого", 6)
    polygon1.sideCount
    polygon1.angleCount
    polygon1.printInfo()

    val circle1 = Circle("круга", "голубого", -2)
    circle1.printInfo()
    println(circle1.checkDiameter())

    val triangle1 = Triangle(3,"треугольника", "синего", 3)
    triangle1.printInfo()
    triangle1.checkAngle()

    val quadrilateral1 = Quadrilateral(4, "четырехугольника", "красного", 4)
    quadrilateral1.printInfo()

//Учебные Заведения

    val school1 = School("School N1", 54, listOf(6,8,14,16), "Physics")
    school1.printIfo()
    school1.spec()

    val preSchool1 = PreSchool("Pre-School N12", 12, listOf(6,8,5,3), "Kids")
    preSchool1.printIfo()


//Иерархия Мебели

    val chair1 = Chair("oak", 54.5, listOf(30,24,67), true)
    chair1.chairInfo()
    chair1.printInfo()

    val table1 = Table("plastic", 10.2, listOf(30,45,50), "triangle")
    table1.tableInfo()

// Containers

    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

     val bottom =  BottomContainer()
    ordinalNumbers.forEach{bottom.addMaterial(it)}
    bottom.addToBottom("added to bottom")
    bottom.printContainer()


    val alphabetical = SortedAlphabetically()
    ordinalNumbers.forEach{alphabetical.addMaterial(it)}
    alphabetical.addAlphabetically("wwwww alphabetical")
    alphabetical.printContainer()


    val mapKey1 = MapKeyValue()
    val keyValue = mapOf("key1" to "value1", "key2" to "value2")
    ordinalNumbers.forEach{mapKey1.addMaterial(it)}
    mapKey1.map(keyValue)
    mapKey1.printContainer()


}