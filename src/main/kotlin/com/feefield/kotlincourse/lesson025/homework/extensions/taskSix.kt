package com.feefield.kotlincourse.lesson025.homework.extensions

//Задание 6. Создай функцию расширение словаря из строк и чисел, которая принимает
// число и возвращает список ключей, длина которых меньше их значений но больше
// заданного в функции аргумента. В случае если список получается пустой нужно
// выкинуть исключение IllegalState.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun  Map<String, Int>.taskSix(arg: Int): List<String> {
    val result = this.filter { it.key.length < it.value && it.key.length > arg }
        .map { it.key }
    if (result.isEmpty()) {
        throw IllegalStateException("Illegal State ex thrown.")
    }
    return result
}