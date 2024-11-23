package com.feefield.kotlincourse.lesson024.homework


fun main() {
    try {
//NullPointerException
        val pointer: String? = null
        println(pointer!!.length)

//ArrayIndexOutOfBoundsException
        val listOne = listOf(3, 6, 10)
        println(listOne[4])

//ClassCastException
        val castOne: String = "error"
        castOne as Int

//NumberFormatException
        val number = "error again"
        number.toInt()


        //IllegalArgumentException
        fun divideZero(a: Int, b: Int): Int {
            require(b != 0) { "B is equal to Zero" }
            return a / b
        }
        divideZero(5, 0)

//IllegalStateException
        val checkFalse = false
        check(checkFalse)

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
        recursiveFun()
        error()
    } catch (e: Throwable) {
        when (e) {
            is NullPointerException -> println("that's NullPointerException")
            is ArrayIndexOutOfBoundsException -> println("that's ArrayIndexOutOfBoundsException")
            is ClassCastException -> println("that's ClassCastException")
            is NumberFormatException -> println("that's NumberFormatException")
            is IllegalArgumentException -> println("that's IllegalArgumentException")
            is IllegalStateException -> println("that's IllegalStateException")
            is StackOverflowError -> println("that's StackOverflowError")
            is OutOfMemoryError -> println("that's OutOfMemoryError")
            else -> println("That's something new")
        }
    }
}