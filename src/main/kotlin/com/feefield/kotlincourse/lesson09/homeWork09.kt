package com.feefield.kotlincourse.lesson09

fun main() {

    var i = 0
    val songPhrase = "Happy Birthday to you"
    val name = "Sasha"

    while (i < 3) {
        if (i == 2) {
            println("Happy Birthday, dear $name,")
        } else {
            println("$songPhrase,")
        }
        i++
    }
    if (songPhrase.startsWith("Happy Birthday")) {
        println("$songPhrase!")
    }
}