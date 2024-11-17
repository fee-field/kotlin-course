package com.feefield.kotlincourse.lesson022.homework.Extensions

//Определите функцию-расширение для класса длинного числа, допускающее null, которая
// не принимает аргументов и возвращает строку.

fun Long?.funLongExt() : String {
    val string1 = ""
    return if (this!= null && this.toString().length > 15) {
        this.toString()
    } else {
        "Long is not long :) "
    }
}