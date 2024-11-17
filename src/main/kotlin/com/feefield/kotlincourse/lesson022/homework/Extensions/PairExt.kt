package com.feefield.kotlincourse.lesson022.homework.Extensions

//Реализуйте метод расширения revert для класса Pair, который меняет местами первый
// и второй элементы пары. Метод должен возвращать новую пару с перевернутыми элементами.
// Протестируйте эту функцию на различных парах значений, в том числе null.

fun <A,B> Pair<A?,B?>.revert() : Pair<B?,A?> {
    return second to first
}