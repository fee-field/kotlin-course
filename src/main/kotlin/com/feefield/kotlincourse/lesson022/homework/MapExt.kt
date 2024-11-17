package com.feefield.kotlincourse.lesson022.homework

//Реализуйте функцию-расширение для класса словаря допускающего null с ключами
// дженериком и значениями типа список из такого же дженерика, которая принимает один
// аргумент типа число и возвращает словарь допускающий null с ключами типа строка и
// значениями типа дженерика допускающего null.

fun <K> Map<K?, List<K>?>.funMapExt(arg1: Int) : Map<String, K?> {
    val changedMap = mutableMapOf<String, K?>()
    this.forEach { (key, value) ->
        if (key != null && value != null) {
            changedMap[key.toString()] = value.getOrNull(arg1)
        }
    }
    return changedMap
}