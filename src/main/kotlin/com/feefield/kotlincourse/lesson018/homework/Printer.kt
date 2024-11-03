package com.feefield.kotlincourse.lesson018.homework

abstract class Printer {
    abstract fun print(text: String)

    protected fun splitTextIntoWords(text: String): List<String> {
        return text.split(" ")
    }
}