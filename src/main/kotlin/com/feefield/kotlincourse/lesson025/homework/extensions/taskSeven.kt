package com.feefield.kotlincourse.lesson025.homework.extensions

//Задание 7. Создай функцию расширения словаря из списка и множества, которая
// принимает все известные тебе типы (вспомни все что знаешь и под каждый тип
// создай аргумент) и возвращает строку. Функция должна распечатать все данные,
// которые тебе в ней доступны и вернуть конкатенацию всех данных которые ей доступны
// (порядок неважен). Конкатенация - это присоединение. Код должен быть отформатирован
// таким образом, чтобы легко читался.
//По аналогии с предыдущим заданием выполни трансформации.

fun Map<List<*>, Set<*>>.taskSeven(
    int: Int,
    long: Long,
    string: String,
    double: Double,
    boolean: Boolean,
    char: Char
): String {
    println(this)
    println("Int arg: $int")
    println("Long arg: $long")
    println("String arg: $string")
    println("Double arg: $double")
    println("Boolean arg: $boolean")
    println("Char arg: $char")
    val concat = this.toString() +
            int.toString() +
            long.toString() +
            string +
            double.toString() +
            boolean.toString() +
            char.toString()
    return concat
}
