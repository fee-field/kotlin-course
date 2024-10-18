package com.feefield.kotlincourse

fun main() {


//Проверить, что размер коллекции больше 5 элементов
    val collect01 = listOf(1, 3, 5, 6, 7, 9)
    if (collect01.size > 5) {
        println("true")
    } else {
        println("false")
    }

//Проверить, что коллекция пустая
    if (collect01.isEmpty()) {
        println("isEmpty")
    } else {
        println("false")
    }

//Проверить, что коллекция не пустая
    if (collect01.isNotEmpty()) {
        println("isNotEmpty")
    } else {
        println("false")
    }

//Взять элемент по индексу или создать значение если индекса не существует
    val index = collect01.getOrElse(30) {"index does not exist"}
    println(index)

//Собрать коллекцию в строку
    val string = collect01.joinToString(" ~|||~ ")
    println(string)
//Посчитать сумму всех значений
    val sum = collect01.sum()
    println(sum)

//Посчитать среднее
    val average: Double = collect01.average()
    println(average)

//Взять максимальное число
    val max = collect01.maxOrNull()
    println(max)

//Взять минимальное число
    val min = collect01.minOrNull()
    println(min)

//Взять первое число или null
    val firstNumb = collect01.getOrNull(3)
    println(firstNumb)
//Проверить что коллекция содержит элемент
    val i = 16
    if (collect01.contains(i)) {
            println("true")
        } else {
            println("does not contain $i")
    }
}