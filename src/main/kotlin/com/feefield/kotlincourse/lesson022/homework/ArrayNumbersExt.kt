package com.feefield.kotlincourse.lesson022.homework

// Определите функцию-расширение для массива чисел, которая не принимает аргументов
// и возвращает пару из чисел.

fun Array<Int>.funPairOfInts() : Pair<Int, Int> {
    val min = this.min()
    val max = this.max()
    return Pair(min,max)
}