package com.feefield.kotlincourse.lesson025.homework

import com.feefield.kotlincourse.lesson025.homework.extensions.taskSix

const val CONST = "Constant text"

fun main() {
//task One
    val taskOne = fun() {
        println(CONST)
    }
    val taskOneAn: () -> Unit = {
        println(CONST)
    }
    val taskOneAnType = {
        println(CONST)
    }
    taskOne()
    taskOneAn()
    taskOneAnType()
//task Two
    val taskTwo = fun(average: List<Int>): Double {
        require(average.isNotEmpty()) { "The list is empty." }
        return average.average()
    }
    val taskTwoAn: (List<Int>) -> Double = {
        require(it.isNotEmpty()) { "The list is empty." }
        it.average()
    }

    val taskTwoType = { average: List<Int> ->
        require(average.isNotEmpty()) { "The list is empty." }
        average.average()
    }
    println(taskTwo(listOf(1, 4, 5, 6, 11)))
    println(taskTwoAn(listOf(1, 4, 5, 6, 11)))
    println(taskTwoType(listOf(1, 4, 5, 6, 11)))

//task Three

    val taskThree = fun(list: List<String>, num: Int): List<String> {
        require(list.isNotEmpty()) { "The list is empty." }
        return list.filter { it.length >= num }
    }

    val taskthreeAn: (List<String>, Int) -> List<String> = { list, num ->
        require(list.isNotEmpty()) { "The list is empty." }
        list.filter { it.length >= num }
    }
    val taskThreeType = { list: List<String>, num: Int ->
        require(list.isNotEmpty()) { "The list is empty." }
        list.filter { it.length >= num }
    }

    println(taskThree(listOf("test", "test1", "test2"), 3))
    println(taskThreeType(listOf("test", "test1", "test2"), 3))

    //task Four

    val taskFour = fun(number: Long): Int {
        return number.toString().sumOf { it.digitToInt() }
    }

    val taskFourAn: (Long) -> Int = {
        it.toString().sumOf { it.digitToInt() }
    }

    val taskFourType = { number: Long ->
        number.toString().sumOf { it.digitToInt() }
    }

    println(taskFourType(4535354353453453))

    //taskFive

    val taskFive = fun List<Int>.(): List<Int> {
        return this.toSet().toList()
    }

    val taskFiveAn: (List<Int>) -> List<Int> = { list ->
        list.toSet().toList()
    }

    val taskFiveType = { list: List<Int> ->
        list.toSet().toList()
    }

    println(taskFiveType(listOf(5, 54, 78, 78, 54)))

    //task Six

    val taskSix = fun Map<String, Int>.(arg: Int): List<String> {
        val result = this.filter { it.key.length < it.value && it.key.length > arg }
            .map { it.key }
        if (result.isEmpty()) {
            throw IllegalStateException("Illegal State ex thrown.")
        }
        return result
    }

    val taskSixAn: (Map<String, Int>, Int) -> List<String> = { map, arg ->
        val result = map.filter { it.key.length < it.value && it.key.length > arg }
            .map { it.key }
        if (result.isEmpty()) {
            throw IllegalStateException("Illegal State ex thrown.")
        }
        result
    }

    val taskSixType = { map: Map<String, Int>, arg: Int ->
        val result = map.filter { it.key.length < it.value && it.key.length > arg }
            .map { it.key }
        if (result.isEmpty()) {
            throw IllegalStateException("Illegal State ex thrown.")
        }
        result
    }

    val map0 = mapOf(
        "test 1" to 1,
        "test 2" to 200
    )
    println(map0.taskSix(2))

    //task Seven

    val taskSeven = fun (
        map: Map<List<*>, Set<*>>,
        int: Int,
        long: Long,
        string: String,
        double: Double,
        boolean: Boolean,
        char: Char
    ): String {
        println(map)
        println("Int arg: $int")
        println("Long arg: $long")
        println("String arg: $string")
        println("Double arg: $double")
        println("Boolean arg: $boolean")
        println("Char arg: $char")
        val concat = map.toString() +
                int.toString() +
                long.toString() +
                string +
                double.toString() +
                boolean.toString() +
                char.toString()
        return concat
    }
    val taskSevenAn: (
        Map<List<*>, Set<*>>,
        Int,
        Long,
        String,
        Double,
        Boolean,
        Char
    ) -> String = { map, int, long, string, double, boolean, char ->
        println(map)
        println("Int arg: $int")
        println("Long arg: $long")
        println("String arg: $string")
        println("Double arg: $double")
        println("Boolean arg: $boolean")
        println("Char arg: $char")
        val concat = map.toString() +
                int.toString() +
                long.toString() +
                string +
                double.toString() +
                boolean.toString() +
                char.toString()
        concat
    }

    val taskSevenType = { map: Map<List<Int>, Set<String>>,
                          int: Int,
                          long: Long,
                          string: String,
                          double: Double,
                          boolean: Boolean,
                          char: Char ->
        println(map)
        println("Int arg: $int")
        println("Long arg: $long")
        println("String arg: $string")
        println("Double arg: $double")
        println("Boolean arg: $boolean")
        println("Char arg: $char")
        val concat = map.toString() +
                int.toString() +
                long.toString() +
                string +
                double.toString() +
                boolean.toString() +
                char.toString()
        concat
    }

    val map = mapOf(
        listOf(1, 2, 3) to setOf("A", "B"),
        listOf(4, 5) to setOf("C", "D")
    )

    val map1 = taskSevenType(
        map,
        125,
        75624626123122,
        "test string",
        5.55,
        true,
        'M'
    )

    println("Result: $map1")
}

//Задание 1. Создай константу в файле с текстом. Создай функцию, которая ничего не
// принимает и не возвращает и печатает в консоль текст константы.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь как функция работает

fun taskOne() {
    println(CONST)
}

//Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее
// арифметическое этого списка. С помощью require проверь, что список не пустой.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов
// данных (в том числе пустого).

fun taskTwo(average: List<Int>): Double {
    require(average.isNotEmpty()) { "The list is empty." }
    return average.average()
    //return average.sum() / average.size()
}

//Задание 3. Создай функцию, которая принимает список строк и число, а возвращает
// список из строк, длина которых больше или равна заданному числу. Если список пуст,
// нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun taskThree(list: List<String>, num: Int): List<String> {
    require(list.isNotEmpty()) { "The list is empty." }
    return list.filter { it.length >= num }
}

//Задание 4. Создай функцию, которая принимает большое число и возвращает сумму
// цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()

fun taskFour(number: Long): Int {
    return number.toString().sumOf { it.digitToInt() }
}

