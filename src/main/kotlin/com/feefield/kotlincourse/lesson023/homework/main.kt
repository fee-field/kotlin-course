package com.feefield.kotlincourse.lesson023.homework

import jdk.incubator.vector.VectorOperators.Test

fun main() {

    analyzeDataType("Bla-Bla")
    analyzeDataType(listOf(17, 24, 45))
    analyzeDataType(true)
    analyzeDataType(mapOf(1 to "first", 4 to "fourth"))

    getAny("3")
    getAny(7)

    println(getStringLengthOrZero("Test"))

    println(safeCastToList(3))
    println(safeCastToList(listOf(4, 19, 22)))

    println(tryCastToListAndPrint("test"))


}


//Задача 1
//Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип аргумента и вывести соответствующее сообщение:
//Для строки: "Это строка: [значение]".
//Для целого числа: "Это целое число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для карты: "Это карта, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.

fun analyzeDataType(param1: Any) {
    when (param1) {
        is String -> println("Это строка: $param1")
        is Int -> println("Это целое число: $param1")
        is List<*> -> println("Это список, количество элементов: ${param1.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${param1.size}")
        else -> println("Неизвестный тип данных")
    }
}

//Задача 2
//Создайте функцию safeCastToList, принимающую параметр типа Any и
// возвращающую размер списка, если аргумент можно безопасно привести
// к типу List. В случае неудачного приведения функция должна возвращать -1.
//Используйте as? для безопасного приведения типа.

fun safeCastToList(param2: Any): Int {
//
//        if (param2 is List<*>) {
//            return param2.size
//        }
//        return -1
//    }
    val cast1 = param2 as? List<*>
    return cast1?.size ?: -1
}

//Задача 3
//Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и возвращает
// длину строки, если аргумент можно привести к типу String. В случае, если аргумент равен null
// или не является строкой, функция должна возвращать 0.

fun getStringLengthOrZero(param4: Any?): Int {
    if (param4 is String) {
        return param4.length
    }
    return 0
}

//Задача 4
//Создайте функцию, которая принимает параметр типа Any.
//Функция гарантированно ожидает число (в виде числа или строки, например 4 или 4.2 или “4.2”)
// и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат, если
// придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.

fun getAny(param5: Any): Any {
    return when (param5) {
        is String -> println(param5.toDouble() * param5.toDouble())
        is Int -> println(param5 * param5)
        else -> "invalid"
    }
}

//Задача 5
//Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму всех
// целочисленных (Int) и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.

fun sumIntOrDoubleValues(param6: List<Any>): Double {
    var sumInt = 0
    var sumDouble = 0.0
    for (item in param6) {
        when (item) {
            is Int -> sumInt += item
            is Double -> sumDouble += item
        }
    }
    return sumInt.toDouble() + sumDouble

}
//Задача 6
//Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>.
// Если приведение успешно, функция должна напечатать все строки из списка, если элемент не является строкой то вывести предупреждение
// об этом. Если приведение неудачно, должно быть выведено сообщение об ошибке, не прерывая выполнение программы.

fun tryCastToListAndPrint(param7: Any) {
    if (param7 is List<*>) {
        for (item in param7) {
            if (item is String) {
                println(item)
            } else {
                println("Not a String")
            }
        }
    } else {
        println("Not a List")
    }

}


