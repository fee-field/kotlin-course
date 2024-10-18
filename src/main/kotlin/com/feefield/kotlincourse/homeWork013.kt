package com.feefield.kotlincourse

fun main() {
    val collect01 = listOf(1, 3, 5, 6, 7, 9, 19, 27, 19)

//Проверить, что размер коллекции больше 5 элементов

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

// Задачи на обработку коллекций

    //Отфильтровать коллекцию по диапазону 18-30
    val range1 = collect01.filter { it in 18..30 }
    println(range1)

    //Выбрать числа, которые не делятся на 2 и 3 одновременно
    val divide1 = collect01.filterNot {it % 2 == 0 || it % 3 == 0}
    println(divide1)

    //Очистить текстовую коллекцию от null элементов
    val strings = listOf("one", "two", "three", "four", "five", null, "six", null)
    val strings1 = listOf("one", "two", "three", "four", "five")
    val removeNulls = strings.filterNotNull()
    println(removeNulls)

    //Преобразовать текстовую коллекцию в коллекцию длин слов
    val length = strings1.map{it.length}
    println("$length - длины слов")

    //Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    val maps = strings1.associate { it to it.reversed() }
    println("$maps - перевернутые слова")

    //Отсортировать список в алфавитном порядке

    val sorted = strings1.sorted()
    println(sorted)

    //Отсортировать список по убыванию
    val sortedDesc = collect01.sortedDescending()
    println(sortedDesc)

    //Распечатать квадраты элементов списка
    val double = collect01.forEach({println(it * it)})

    //Группировать список по первой букве слов
    val group = strings.groupBy {  }

    //Очистить список от дублей
    val distinct = collect01.distinct()
    println(distinct)

    //Взять первые 3 элемента списка
    val last = collect01.take(3)
    println(last)

    //Взять последние 3 элемента списка
    val last1 = collect01.takeLast(3)
    println(last1)





}