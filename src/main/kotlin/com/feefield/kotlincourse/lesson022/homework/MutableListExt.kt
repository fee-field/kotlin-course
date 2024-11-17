package com.feefield.kotlincourse.lesson022.homework

//Создайте функцию-расширение для класса изменяемого списка элементов с дженериком,
// которая принимает два аргумента: один типа дженерик, допускающий null, и другой
// типа число, и возвращает значение типа дженерик, допускающий null.

fun <T> MutableList<T>.funChangeValue(arg1: T?, arg2: Int) : T? {
    if (arg2 in 0 until this.size && arg1 != null) {
        this[arg2] = arg1
        return arg1
    }
    return null
}