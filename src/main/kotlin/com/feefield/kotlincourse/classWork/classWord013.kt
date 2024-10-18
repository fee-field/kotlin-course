package com.feefield.kotlincourse.classWork

fun main() {
    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = list.filter { it in 7..17 } // it - обращение к переменной
    println(filtered2)

    val numbers = listOf(-1, 2, -3, 4, -5)
    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers)

    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers)

    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList)

    //получние элементов

    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive)

    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse)

    // преобразование коллекций

    val incrementedNumbers: List<String> = numbers.map { "$it% "}
    println(incrementedNumbers)

    val numberSquareMap = numbers.associate { it to it * it }
    println(numberSquareMap)

    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )

    println(multipleList)

    val flattenList = multipleList.flatten()
    println(flattenList)

    val flattenListAfterMapping = multipleList.flatMap { list1: List<Int> ->
        list1.map { it * 2 }
    }
    println(flattenListAfterMapping)

    val numbersString = numbers.joinToString(separator = " % ") {
        "$it * $it"
    }
    println(numbersString)

    val sortedNumbers = numbers.sorted()
    println(sortedNumbers)

    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers)

    numbers.forEach { println (it)}

    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers)

    val averageOfNumbers = numbers.average()
    println(averageOfNumbers)

    val maxNumber = numbers.maxOrNull()
    println(maxNumber)

    val minNumber = numbers.minOrNull()
    println(minNumber)

    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign)

    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distinctNumbers)

    println(numbers.take(3))

    println(numbers.takeLast(3))

    println(numbers.size)

    val numbers1 = listOf(1,3,5,7)
    if (numbers1.size < 5) {
        println("ok")
    }
    numbers1.isEmpty()
    numbers1.isNotEmpty()

    val defaultValue = numbers.getOrElse(8) { 2 }
    println(defaultValue)

}


    fun filter(collection: List<Int>): List<Int> {
        val result = mutableListOf<Int>()
        for (i in collection) {
            if (i in 7..17) result.add(i)
        }
        return result
    }
