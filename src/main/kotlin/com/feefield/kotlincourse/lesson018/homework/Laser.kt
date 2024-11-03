package com.feefield.kotlincourse.lesson018.homework

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = splitTextIntoWords(text)
        words.forEach { word ->
            println("$word\u001B[0m")
        }
    }
}