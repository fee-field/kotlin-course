package com.feefield.kotlincourse.lesson018

import com.feefield.kotlincourse.lesson018.homework.Printer

class InkjetPrinter : Printer() {
    private val colors = listOf(
        "\u001B[31m\u001B[47m",
        "\u001B[34m\u001B[43m",
    )
    override fun print(text: String) {
        val words = splitTextIntoWords(text)
        words.forEachIndexed { index, word ->
            val color = colors
            println("$color$word\u001B[0m")
        }
    }
}