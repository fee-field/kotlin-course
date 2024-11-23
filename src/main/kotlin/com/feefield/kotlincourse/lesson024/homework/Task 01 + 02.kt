package com.feefield.kotlincourse.lesson024.homework

fun main() {


//Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//Задание 2. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок


    //NullPointerException
    val pointer: String? = null
    try {
        println(pointer!!.length)
    } catch (e: NullPointerException) {
        "that's NullPointerException"
    }

    //ArrayIndexOutOfBoundsException
    val listOne = listOf(3, 6, 10)
    try {
        println(listOne[4])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("that's ArrayIndexOutOfBoundsException")
    }

    //ClassCastException
    val castOne: String = "error"
    try {
        castOne as Int
    } catch (e: ClassCastException) {
        println("that's ClassCastException")
    }

    //NumberFormatException
    val number = "error again"
    try {
        number.toInt()
    } catch (e: NumberFormatException) {
        println("that's NumberFormatException")
    }

    //IllegalArgumentException
    fun divideZero(a: Int, b: Int): Int {
        require(b != 0) { "B is equal to Zero" }
        return a / b
    }
    try {
        divideZero(5, 0)
    } catch (e: IllegalArgumentException) {
        println("that's IllegalArgumentException")
    }

    //IllegalStateException
    val checkFalse = false
    try {
        check(checkFalse)
    } catch (e: IllegalStateException) {
        println("that's IllegalStateException")
    }

    //OutOfMemoryError
    var memoryError = "very long line very long line"
    fun error() {
        while (true) {
            memoryError += memoryError
        }
    }

    //StackOverflowError
    fun recursiveFun() {
        recursiveFun()
    }

    try {
        recursiveFun()
    } catch (e: StackOverflowError) {
        println("that's StackOverflowError")
    }

    try {
        error()
    } catch (e: OutOfMemoryError) {
        println("that's OutOfMemoryError")
    }
}