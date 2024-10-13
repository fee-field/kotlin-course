package com.feefield.kotlincourse.lesson012

fun main() {

    println(multiplyByTwo(13)) // task 1
    println(isEven(67))
    drawRectangle(3,6)

}

//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

fun fun01() {
    }

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun fun02(a: Int, b: Int): Int {
    return a + b
}

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

fun fun03(a: String) {

}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.

fun fun04(a: List<Int>): Double {
    return 1.0
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

fun fun05(a: String?): Int? {
    return a?.length
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.

fun fun06(): Int? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.

fun fun07(a: List<Int>?) {

}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.

fun fun08(a: Int): String? {
    return null
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.

fun fun09(): List<String?> {
    return listOf(null)
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.

fun fun010(a: String?, b: Int?): Boolean? {
    return null
}

//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(a: Int): Int {
    return a * 2
}

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

fun isEven(a: Int): Boolean {
    return if (a % 2 == 0 ) {
        true
        } else {
            false}
    }

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int) {
    for (i in 1..n) {
        println(i)
    }
    if (n < 1) {
        return     /// ,????
    }
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
//Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(n: List<Int>): Int? {
    for (i in n) {
        if (i < 0) return i
    }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(strings: List<String?>) {
    for (i in strings) {
        if (i != null) {
            println(i)
        } else {
            return
        }
    }
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования
// кода и трудно воспринимаемых фрагментов.
//
//Сначала сделай запуск функции и посмотри на результат её работы. Сделай запуск после рефакторинга и проверь, чтобы
// результат работы был аналогичным.

private fun checkSize(s: Int, arg: String) {
    if (s <= 0) throw IllegalArgumentException("$arg должно быть положительным и больше нуля")
}

private fun drawTopBottomLine(length: Int, sideSymbol: String, middleSymbol: String) {
    var line = middleSymbol
    for (i in 1 until length - 1) {
        line += sideSymbol
    }
    line += sideSymbol + "\n"
    print(line)
}

private fun drawMiddleLine(width: Int, height: Int, sideSymbol: String, middleSymbol: String) {
    for (i in 1 until height - 1) {
        var middleLine = sideSymbol
        for (j in 1 until width - 1) {
            middleLine += sideSymbol
        }
        middleLine += middleSymbol + "\n"
        print(middleLine)
    }
}


fun drawRectangle(width: Int, height: Int) {
    checkSize(width, "width")
    checkSize(width, "height")
//    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
//    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Верхняя граница
//    var topLine = "+"
//    for (i in 1 until width - 1) {
//        topLine += "-"
//    }
//    topLine += "+\n"
//    print(topLine)
    drawTopBottomLine(width, "+", "-")

    // Боковые границы
//    for (i in 1 until height - 1) {
//        var middleLine = "|"
//        for (j in 1 until width - 1) {
//            middleLine += " "
//        }
//        middleLine += "|\n"
//        print(middleLine)
//    }
    drawMiddleLine(width, height, "|", " " )

//    // Нижняя граница
//    var bottomLine = "+"
//    for (i in 1 until width - 1) {
//        bottomLine += "-"
//    }
//    bottomLine += "+\n"
//    print(bottomLine)
    drawTopBottomLine(width, "+", "-")
}











