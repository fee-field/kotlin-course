package com.feefield.kotlincourse.lesson026.homework

fun main() {

    //1
    val data1 = listOf("one", "two", "three", "four")
    val call1 = filterStrings(data1) { it.length <= 3 }
    val call2 = filterStrings(data1) { "o" in it }
    println(call1)
    println(call2)

    //2
    val data2 = listOf(1, 3, 5, 8, 12, 1025)
    val call3 = applyToNumbers(data2) { it * it }
    val call4 = applyToNumbers(data2) { (it - 3) / 2 }
    println(call3)
    println(call4)

    //3
    val data3 = listOf(-17, 33, -54, 68)
    val call5 = sumByCondition(data3) { it % 2 == 0 }
    val call6 = sumByCondition(data3) { it > 0 }
    println(call5)
    println(call6)

    //4
    val data4 = listOf(1, 2, 3, 4, 50)
    val data5 = listOf(60, 70, 80, 90)
    val call7 = combineAndTransform(data4, data5) { it -> it.map { "We are strings now $it" } }
    println(call7)
    val call8 = combineAndTransform(data4, data5) { it -> it.map { it + 5}}
    println(call8)
}

//Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.
fun first(arg1: () -> Unit) {
}

//Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.
fun second(arg1: (Int) -> String) {
}

//Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.
fun third(arg1: Int.(String) -> Boolean) {
}

//Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.
fun fourth(arg1: (Double, Double) -> Boolean) {
}

//Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.
fun <T> fifth(arg1: (T) -> List<T>) {
}

//Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию, принимающую Int
// и возвращающую Boolean.
fun six(arg1: (String) -> (Int) -> Boolean) {
}

//Напишите функцию, которая принимает список чисел, множество строк, функцию с аргументами типа List<Int> и
// Set<String> и возвращающую Map<String, Int>.
fun seven(arg2: List<Int>, arg3: Set<String>, arg1: (List<Int>, Set<String>) -> Map<String, Int>) {
}

//Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку O_O
fun eight(arg1: Int, arg2: (Int) -> String): String {
    return arg2(5)
}

//Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.
fun nine(arg1: () -> (() -> Unit)) {
}

//Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки,
// удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение). Функция должна вернуть
// результат фильтрации исходного списка строк.

fun filterStrings(arg1: List<String>, arg2: (String) -> Boolean): List<String> {
    return arg1.filter(arg2)
}

//Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
// преобразующую каждое число в другое число (те-есть принимающая число и
// возвращающая число). Функция должна вернуть результат преобразования
// исходного списка чисел.

fun applyToNumbers(arg1: List<Int>, arg2: (Int) -> Int): List<Int> {
    return arg1.map(arg2)
}

//Реализуйте функцию sumByCondition, которая принимает список чисел и функцию,
// определяющую условие для включения числа в сумму. Функция должна вернуть сумму
// чисел, прошедших проверку.

fun sumByCondition(arg1: List<Int>, arg2: (Int) -> Boolean): Int {
    return arg1.filter(arg2).sum()
}

//Напишите функцию combineAndTransform, которая принимает две коллекции одного типа
// и функцию для их объединения и преобразования в одну коллекцию другого типа.
// Функция должна вернуть результат преобразования (коллекцию второго типа)

fun <T, R> combineAndTransform(
    arg1: Collection<T>, arg2: Collection<T>,
    arg3: (Collection<T>) -> Collection<R>
): Collection<R> {
    return arg3(arg1 + arg2)
}

