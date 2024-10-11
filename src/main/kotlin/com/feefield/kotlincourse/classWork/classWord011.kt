package com.feefield.kotlincourse.classWork

fun main() {

    val pair: Pair<Int, String> = 1 to "a" // ключ -значение

    println(pair.first)

    val emptyMap: Map<String, String> = mapOf<String, String>()

    val capitals: Map<String, String> = mapOf()

    val mutableCapitals = mutableMapOf("Germany" to "Berlin", "Spain" to "Madrid")
    mutableCapitals["GB"] = "London"

    println(mutableCapitals["GB"])


}