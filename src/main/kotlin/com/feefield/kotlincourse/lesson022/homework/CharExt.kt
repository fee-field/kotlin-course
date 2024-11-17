package com.feefield.kotlincourse.lesson022.homework

//Напишите функцию-расширение для класса символа, допускающего null,
// которая принимает три аргумента: два типа число и один булево, и ничего не возвращает.

fun Char.funCharNull(arg1: Int, arg2: Int, arg3: Boolean) {
    if (arg1 > arg2 && arg3 ) {
        println("$this: $arg1 is more than $arg2")
            }
    else {
        println("$this: $arg2 is more than $arg1")
    }
}